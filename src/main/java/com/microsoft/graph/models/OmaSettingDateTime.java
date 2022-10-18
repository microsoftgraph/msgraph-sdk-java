package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OmaSettingDateTime extends OmaSetting implements Parsable {
    /** Value. */
    private OffsetDateTime _value;
    /**
     * Instantiates a new OmaSettingDateTime and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OmaSettingDateTime() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingDateTime");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingDateTime
     */
    @javax.annotation.Nonnull
    public static OmaSettingDateTime createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingDateTime();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSettingDateTime currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the value property value. Value.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getValue() {
        return this._value;
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
        writer.writeOffsetDateTimeValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final OffsetDateTime value) {
        this._value = value;
    }
}
