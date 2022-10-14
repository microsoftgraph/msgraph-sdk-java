package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileCustomConfiguration extends DeviceConfiguration implements Parsable {
    /** OMA settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<OmaSetting> _omaSettings;
    /**
     * Instantiates a new AndroidWorkProfileCustomConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCustomConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileCustomConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileCustomConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileCustomConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileCustomConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileCustomConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("omaSettings", (n) -> { currentObject.setOmaSettings(n.getCollectionOfObjectValues(OmaSetting::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the omaSettings property value. OMA settings. This collection can contain a maximum of 500 elements.
     * @return a omaSetting
     */
    @javax.annotation.Nullable
    public java.util.List<OmaSetting> getOmaSettings() {
        return this._omaSettings;
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
        writer.writeCollectionOfObjectValues("omaSettings", this.getOmaSettings());
    }
    /**
     * Sets the omaSettings property value. OMA settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the omaSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOmaSettings(@javax.annotation.Nullable final java.util.List<OmaSetting> value) {
        this._omaSettings = value;
    }
}
