package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** App for Windows information protection */
public class WindowsInformationProtectionApp implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If true, app is denied protection or exemption. */
    private Boolean _denied;
    /** The app's description. */
    private String _description;
    /** App display name. */
    private String _displayName;
    /** The product name. */
    private String _productName;
    /** The publisher name */
    private String _publisherName;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new windowsInformationProtectionApp and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionApp() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.windowsInformationProtectionApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionApp
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsInformationProtectionDesktopApp": return new WindowsInformationProtectionDesktopApp();
                case "#microsoft.graph.windowsInformationProtectionStoreApp": return new WindowsInformationProtectionStoreApp();
            }
        }
        return new WindowsInformationProtectionApp();
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
     * Gets the denied property value. If true, app is denied protection or exemption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDenied() {
        return this._denied;
    }
    /**
     * Gets the description property value. The app's description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. App display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionApp currentObject = this;
        return new HashMap<>(6) {{
            this.put("denied", (n) -> { currentObject.setDenied(n.getBooleanValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("productName", (n) -> { currentObject.setProductName(n.getStringValue()); });
            this.put("publisherName", (n) -> { currentObject.setPublisherName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the productName property value. The product name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this._productName;
    }
    /**
     * Gets the publisherName property value. The publisher name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherName() {
        return this._publisherName;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("denied", this.getDenied());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("@odata.type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the denied property value. If true, app is denied protection or exemption.
     * @param value Value to set for the denied property.
     * @return a void
     */
    public void setDenied(@javax.annotation.Nullable final Boolean value) {
        this._denied = value;
    }
    /**
     * Sets the description property value. The app's description.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. App display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the productName property value. The product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    public void setProductName(@javax.annotation.Nullable final String value) {
        this._productName = value;
    }
    /**
     * Sets the publisherName property value. The publisher name
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    public void setPublisherName(@javax.annotation.Nullable final String value) {
        this._publisherName = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
