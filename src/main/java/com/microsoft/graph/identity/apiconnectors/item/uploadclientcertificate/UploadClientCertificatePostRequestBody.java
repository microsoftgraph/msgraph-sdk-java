package com.microsoft.graph.identity.apiconnectors.item.uploadclientcertificate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the uploadClientCertificate method. */
public class UploadClientCertificatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The password property */
    private String _password;
    /** The pkcs12Value property */
    private String _pkcs12Value;
    /**
     * Instantiates a new uploadClientCertificatePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UploadClientCertificatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadClientCertificatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static UploadClientCertificatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadClientCertificatePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UploadClientCertificatePostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("pkcs12Value", (n) -> { currentObject.setPkcs12Value(n.getStringValue()); });
        }};
    }
    /**
     * Gets the password property value. The password property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the pkcs12Value property value. The pkcs12Value property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPkcs12Value() {
        return this._pkcs12Value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("pkcs12Value", this.getPkcs12Value());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the pkcs12Value property value. The pkcs12Value property
     * @param value Value to set for the pkcs12Value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPkcs12Value(@javax.annotation.Nullable final String value) {
        this._pkcs12Value = value;
    }
}
