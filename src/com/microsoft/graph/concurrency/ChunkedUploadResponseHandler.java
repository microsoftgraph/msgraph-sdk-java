// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;

import com.microsoft.graph.extensions.ChunkedUploadResult;
import com.microsoft.graph.extensions.UploadSession;
import com.microsoft.graph.http.DefaultHttpProvider;
import com.microsoft.graph.http.GraphServiceException;
import com.microsoft.graph.http.HttpResponseCode;
import com.microsoft.graph.http.IConnection;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.http.IStatefulResponseHandler;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * The class handles the stateful response from OneDrive upload session.
 *
 * @param <UploadType> The expected uploaded item.
 */
public class ChunkedUploadResponseHandler<UploadType>
        implements IStatefulResponseHandler<ChunkedUploadResult, UploadType> {
    /**
     * The expected deserialize type for upload type.
     */
    private final Class<UploadType> mDeserializeTypeClass;

    /**
     * Create a chunked upload response handler.
     *
     * @param uploadType The expected upload item type.
     */
    public ChunkedUploadResponseHandler(final Class<UploadType> uploadType) {
        this.mDeserializeTypeClass = uploadType;
    }

    /**
     * Do nothing before get response.
     *
     * @param connection The connection.
     */
    @Override
    public void configConnection(final IConnection connection) {
        return;
    }

    /**
     * Generate the chunked upload response result.
     *
     * @param request    The http request.
     * @param connection The http connection.
     * @param serializer The serializer.
     * @param logger     The system logger.
     * @return The chunked upload result which could be upload session/uploaded item or error.
     * @throws Exception An exception occurs if the request was unable to complete for any reason.
     */
    @Override
    public ChunkedUploadResult generateResult(
            final IHttpRequest request,
            final IConnection connection,
            final ISerializer serializer,
            final ILogger logger) throws Exception {
        InputStream in = null;

        try {
            if (connection.getResponseCode() == HttpResponseCode.HTTP_ACCEPTED) {
                logger.logDebug("Chunk bytes has been accepted by the server.");
                in = new BufferedInputStream(connection.getInputStream());
                final UploadSession seesion = serializer.deserializeObject(
                        DefaultHttpProvider.streamToString(in), UploadSession.class);

                return new ChunkedUploadResult(seesion);

            } else if (connection.getResponseCode() == HttpResponseCode.HTTP_CREATED
                    || connection.getResponseCode() == HttpResponseCode.HTTP_OK) {
                logger.logDebug("Upload session is completed, uploaded item returned.");
                in = new BufferedInputStream(connection.getInputStream());
                String rawJson = DefaultHttpProvider.streamToString(in);
                UploadType uploadedItem = serializer.deserializeObject(rawJson,
                        this.mDeserializeTypeClass);

                return new ChunkedUploadResult(uploadedItem);
            } else if (connection.getResponseCode() >= HttpResponseCode.HTTP_CLIENT_ERROR) {
                logger.logDebug("Receiving error during upload, see detail on result error");

                return new ChunkedUploadResult(
                        GraphServiceException.createFromConnection(request, null, serializer,
                                connection));
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }

        return null;
    }
}
