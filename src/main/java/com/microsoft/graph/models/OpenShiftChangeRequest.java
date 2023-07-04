package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenShiftChangeRequest extends ScheduleChangeRequest implements Parsable {
    /**
     * ID for the open shift.
     */
    private String openShiftId;
    /**
     * Instantiates a new OpenShiftChangeRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OpenShiftChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.openShiftChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenShiftChangeRequest
     */
    @javax.annotation.Nonnull
    public static OpenShiftChangeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShiftChangeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("openShiftId", (n) -> { this.setOpenShiftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the openShiftId property value. ID for the open shift.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOpenShiftId() {
        return this.openShiftId;
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
        writer.writeStringValue("openShiftId", this.getOpenShiftId());
    }
    /**
     * Sets the openShiftId property value. ID for the open shift.
     * @param value Value to set for the openShiftId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenShiftId(@javax.annotation.Nullable final String value) {
        this.openShiftId = value;
    }
}
