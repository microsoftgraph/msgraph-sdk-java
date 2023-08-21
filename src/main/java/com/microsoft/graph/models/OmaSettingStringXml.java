package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OMA Settings StringXML definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OmaSettingStringXml extends OmaSetting implements Parsable {
    /**
     * File name associated with the Value property (.xml).
     */
    private String fileName;
    /**
     * Value. (UTF8 encoded byte array)
     */
    private byte[] value;
    /**
     * Instantiates a new omaSettingStringXml and sets the default values.
     */
    public OmaSettingStringXml() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingStringXml");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a omaSettingStringXml
     */
    @jakarta.annotation.Nonnull
    public static OmaSettingStringXml createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingStringXml();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. File name associated with the Value property (.xml).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the value property value. Value. (UTF8 encoded byte array)
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeByteArrayValue("value", this.getValue());
    }
    /**
     * Sets the fileName property value. File name associated with the Value property (.xml).
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the value property value. Value. (UTF8 encoded byte array)
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final byte[] value) {
        this.value = value;
    }
}
