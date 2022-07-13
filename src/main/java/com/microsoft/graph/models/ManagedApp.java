package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedApp extends MobileApp implements Parsable {
    /** A managed (MAM) application's availability. */
    private ManagedAppAvailability _appAvailability;
    /** The Application's version. */
    private String _version;
    /**
     * Instantiates a new ManagedApp and sets the default values.
     * @return a void
     */
    public ManagedApp() {
        super();
        this.setType("#microsoft.graph.managedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedApp
     */
    @javax.annotation.Nonnull
    public static ManagedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.managedAndroidStoreApp": return new ManagedAndroidStoreApp();
                case "#microsoft.graph.managedIOSStoreApp": return new ManagedIOSStoreApp();
                case "#microsoft.graph.managedMobileLobApp": return new ManagedMobileLobApp();
            }
        }
        return new ManagedApp();
    }
    /**
     * Gets the appAvailability property value. A managed (MAM) application's availability.
     * @return a managedAppAvailability
     */
    @javax.annotation.Nullable
    public ManagedAppAvailability getAppAvailability() {
        return this._appAvailability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appAvailability", (n) -> { currentObject.setAppAvailability(n.getEnumValue(ManagedAppAvailability.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the version property value. The Application's version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appAvailability", this.getAppAvailability());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the appAvailability property value. A managed (MAM) application's availability.
     * @param value Value to set for the appAvailability property.
     * @return a void
     */
    public void setAppAvailability(@javax.annotation.Nullable final ManagedAppAvailability value) {
        this._appAvailability = value;
    }
    /**
     * Sets the version property value. The Application's version.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
