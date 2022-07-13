package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudAppSecuritySessionControl extends ConditionalAccessSessionControl implements Parsable {
    /** Possible values are: mcasConfigured, monitorOnly, blockDownloads. To learn more about these values, Deploy Conditional Access App Control for featured apps. */
    private CloudAppSecuritySessionControlType _cloudAppSecurityType;
    /**
     * Instantiates a new CloudAppSecuritySessionControl and sets the default values.
     * @return a void
     */
    public CloudAppSecuritySessionControl() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudAppSecuritySessionControl
     */
    @javax.annotation.Nonnull
    public static CloudAppSecuritySessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAppSecuritySessionControl();
    }
    /**
     * Gets the cloudAppSecurityType property value. Possible values are: mcasConfigured, monitorOnly, blockDownloads. To learn more about these values, Deploy Conditional Access App Control for featured apps.
     * @return a cloudAppSecuritySessionControlType
     */
    @javax.annotation.Nullable
    public CloudAppSecuritySessionControlType getCloudAppSecurityType() {
        return this._cloudAppSecurityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudAppSecuritySessionControl currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cloudAppSecurityType", (n) -> { currentObject.setCloudAppSecurityType(n.getEnumValue(CloudAppSecuritySessionControlType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("cloudAppSecurityType", this.getCloudAppSecurityType());
    }
    /**
     * Sets the cloudAppSecurityType property value. Possible values are: mcasConfigured, monitorOnly, blockDownloads. To learn more about these values, Deploy Conditional Access App Control for featured apps.
     * @param value Value to set for the cloudAppSecurityType property.
     * @return a void
     */
    public void setCloudAppSecurityType(@javax.annotation.Nullable final CloudAppSecuritySessionControlType value) {
        this._cloudAppSecurityType = value;
    }
}
