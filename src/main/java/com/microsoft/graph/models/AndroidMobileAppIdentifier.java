package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidMobileAppIdentifier extends MobileAppIdentifier implements Parsable {
    /** The identifier for an app, as specified in the play store. */
    private String _packageId;
    /**
     * Instantiates a new AndroidMobileAppIdentifier and sets the default values.
     * @return a void
     */
    public AndroidMobileAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.androidMobileAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidMobileAppIdentifier
     */
    @javax.annotation.Nonnull
    public static AndroidMobileAppIdentifier createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidMobileAppIdentifier();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidMobileAppIdentifier currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the packageId property value. The identifier for an app, as specified in the play store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this._packageId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("packageId", this.getPackageId());
    }
    /**
     * Sets the packageId property value. The identifier for an app, as specified in the play store.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
}
