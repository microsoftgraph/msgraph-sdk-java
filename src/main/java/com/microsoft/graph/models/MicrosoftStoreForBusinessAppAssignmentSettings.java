package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftStoreForBusinessAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** Whether or not to use device execution context for Microsoft Store for Business mobile app. */
    private Boolean _useDeviceContext;
    /**
     * Instantiates a new MicrosoftStoreForBusinessAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftStoreForBusinessAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftStoreForBusinessAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static MicrosoftStoreForBusinessAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftStoreForBusinessAppAssignmentSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("useDeviceContext", (n) -> { currentObject.setUseDeviceContext(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the useDeviceContext property value. Whether or not to use device execution context for Microsoft Store for Business mobile app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseDeviceContext() {
        return this._useDeviceContext;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("useDeviceContext", this.getUseDeviceContext());
    }
    /**
     * Sets the useDeviceContext property value. Whether or not to use device execution context for Microsoft Store for Business mobile app.
     * @param value Value to set for the useDeviceContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseDeviceContext(@javax.annotation.Nullable final Boolean value) {
        this._useDeviceContext = value;
    }
}
