package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserAgent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifies the version of application software used by this endpoint.
     */
    private String applicationVersion;
    /**
     * User-agent header value reported by this endpoint.
     */
    private String headerValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new userAgent and sets the default values.
     */
    public UserAgent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAgent
     */
    @jakarta.annotation.Nonnull
    public static UserAgent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.callRecords.clientUserAgent": return new ClientUserAgent();
                case "#microsoft.graph.callRecords.serviceUserAgent": return new ServiceUserAgent();
            }
        }
        return new UserAgent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the applicationVersion property value. Identifies the version of application software used by this endpoint.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationVersion() {
        return this.applicationVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("applicationVersion", (n) -> { this.setApplicationVersion(n.getStringValue()); });
        deserializerMap.put("headerValue", (n) -> { this.setHeaderValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headerValue property value. User-agent header value reported by this endpoint.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHeaderValue() {
        return this.headerValue;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationVersion", this.getApplicationVersion());
        writer.writeStringValue("headerValue", this.getHeaderValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicationVersion property value. Identifies the version of application software used by this endpoint.
     * @param value Value to set for the applicationVersion property.
     */
    public void setApplicationVersion(@jakarta.annotation.Nullable final String value) {
        this.applicationVersion = value;
    }
    /**
     * Sets the headerValue property value. User-agent header value reported by this endpoint.
     * @param value Value to set for the headerValue property.
     */
    public void setHeaderValue(@jakarta.annotation.Nullable final String value) {
        this.headerValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
