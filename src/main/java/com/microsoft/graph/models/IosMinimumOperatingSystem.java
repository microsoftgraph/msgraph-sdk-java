package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties of the minimum operating system required for an iOS mobile app. */
public class IosMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Version 10.0 or later. */
    private Boolean _v10_0;
    /** Version 11.0 or later. */
    private Boolean _v11_0;
    /** Version 12.0 or later. */
    private Boolean _v12_0;
    /** Version 13.0 or later. */
    private Boolean _v13_0;
    /** Version 14.0 or later. */
    private Boolean _v14_0;
    /** Version 8.0 or later. */
    private Boolean _v8_0;
    /** Version 9.0 or later. */
    private Boolean _v9_0;
    /**
     * Instantiates a new iosMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    public IosMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static IosMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMinimumOperatingSystem();
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
        final IosMinimumOperatingSystem currentObject = this;
        return new HashMap<>(7) {{
            this.put("v10_0", (n) -> { currentObject.setV10_0(n.getBooleanValue()); });
            this.put("v11_0", (n) -> { currentObject.setV11_0(n.getBooleanValue()); });
            this.put("v12_0", (n) -> { currentObject.setV12_0(n.getBooleanValue()); });
            this.put("v13_0", (n) -> { currentObject.setV13_0(n.getBooleanValue()); });
            this.put("v14_0", (n) -> { currentObject.setV14_0(n.getBooleanValue()); });
            this.put("v8_0", (n) -> { currentObject.setV8_0(n.getBooleanValue()); });
            this.put("v9_0", (n) -> { currentObject.setV9_0(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the v10_0 property value. Version 10.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_0() {
        return this._v10_0;
    }
    /**
     * Gets the v11_0 property value. Version 11.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV11_0() {
        return this._v11_0;
    }
    /**
     * Gets the v12_0 property value. Version 12.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV12_0() {
        return this._v12_0;
    }
    /**
     * Gets the v13_0 property value. Version 13.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV13_0() {
        return this._v13_0;
    }
    /**
     * Gets the v14_0 property value. Version 14.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV14_0() {
        return this._v14_0;
    }
    /**
     * Gets the v8_0 property value. Version 8.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV8_0() {
        return this._v8_0;
    }
    /**
     * Gets the v9_0 property value. Version 9.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV9_0() {
        return this._v9_0;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("v10_0", this.getV10_0());
        writer.writeBooleanValue("v11_0", this.getV11_0());
        writer.writeBooleanValue("v12_0", this.getV12_0());
        writer.writeBooleanValue("v13_0", this.getV13_0());
        writer.writeBooleanValue("v14_0", this.getV14_0());
        writer.writeBooleanValue("v8_0", this.getV8_0());
        writer.writeBooleanValue("v9_0", this.getV9_0());
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
     * Sets the v10_0 property value. Version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     * @return a void
     */
    public void setV10_0(@javax.annotation.Nullable final Boolean value) {
        this._v10_0 = value;
    }
    /**
     * Sets the v11_0 property value. Version 11.0 or later.
     * @param value Value to set for the v11_0 property.
     * @return a void
     */
    public void setV11_0(@javax.annotation.Nullable final Boolean value) {
        this._v11_0 = value;
    }
    /**
     * Sets the v12_0 property value. Version 12.0 or later.
     * @param value Value to set for the v12_0 property.
     * @return a void
     */
    public void setV12_0(@javax.annotation.Nullable final Boolean value) {
        this._v12_0 = value;
    }
    /**
     * Sets the v13_0 property value. Version 13.0 or later.
     * @param value Value to set for the v13_0 property.
     * @return a void
     */
    public void setV13_0(@javax.annotation.Nullable final Boolean value) {
        this._v13_0 = value;
    }
    /**
     * Sets the v14_0 property value. Version 14.0 or later.
     * @param value Value to set for the v14_0 property.
     * @return a void
     */
    public void setV14_0(@javax.annotation.Nullable final Boolean value) {
        this._v14_0 = value;
    }
    /**
     * Sets the v8_0 property value. Version 8.0 or later.
     * @param value Value to set for the v8_0 property.
     * @return a void
     */
    public void setV8_0(@javax.annotation.Nullable final Boolean value) {
        this._v8_0 = value;
    }
    /**
     * Sets the v9_0 property value. Version 9.0 or later.
     * @param value Value to set for the v9_0 property.
     * @return a void
     */
    public void setV9_0(@javax.annotation.Nullable final Boolean value) {
        this._v9_0 = value;
    }
}
