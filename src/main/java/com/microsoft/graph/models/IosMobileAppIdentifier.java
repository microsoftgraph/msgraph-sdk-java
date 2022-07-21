package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosMobileAppIdentifier extends MobileAppIdentifier implements Parsable {
    /** The identifier for an app, as specified in the app store. */
    private String _bundleId;
    /**
     * Instantiates a new IosMobileAppIdentifier and sets the default values.
     * @return a void
     */
    public IosMobileAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.iosMobileAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosMobileAppIdentifier
     */
    @javax.annotation.Nonnull
    public static IosMobileAppIdentifier createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMobileAppIdentifier();
    }
    /**
     * Gets the bundleId property value. The identifier for an app, as specified in the app store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosMobileAppIdentifier currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
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
        writer.writeStringValue("bundleId", this.getBundleId());
    }
    /**
     * Sets the bundleId property value. The identifier for an app, as specified in the app store.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
}
