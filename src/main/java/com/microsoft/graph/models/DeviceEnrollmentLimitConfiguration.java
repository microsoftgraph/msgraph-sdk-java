package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentLimitConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** The maximum number of devices that a user can enroll */
    private Integer _limit;
    /**
     * Instantiates a new DeviceEnrollmentLimitConfiguration and sets the default values.
     * @return a void
     */
    public DeviceEnrollmentLimitConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentLimitConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentLimitConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentLimitConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentLimitConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentLimitConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("limit", (n) -> { currentObject.setLimit(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the limit property value. The maximum number of devices that a user can enroll
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLimit() {
        return this._limit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("limit", this.getLimit());
    }
    /**
     * Sets the limit property value. The maximum number of devices that a user can enroll
     * @param value Value to set for the limit property.
     * @return a void
     */
    public void setLimit(@javax.annotation.Nullable final Integer value) {
        this._limit = value;
    }
}
