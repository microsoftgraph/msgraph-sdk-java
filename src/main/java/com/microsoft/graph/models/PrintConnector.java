package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintConnector extends Entity implements Parsable {
    /** The connector's version. */
    private String _appVersion;
    /** The name of the connector. */
    private String _displayName;
    /** The connector machine's hostname. */
    private String _fullyQualifiedDomainName;
    /** The physical and/or organizational location of the connector. */
    private PrinterLocation _location;
    /** The connector machine's operating system version. */
    private String _operatingSystem;
    /** The DateTimeOffset when the connector was registered. */
    private OffsetDateTime _registeredDateTime;
    /**
     * Instantiates a new printConnector and sets the default values.
     * @return a void
     */
    public PrintConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printConnector
     */
    @javax.annotation.Nonnull
    public static PrintConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintConnector();
    }
    /**
     * Gets the appVersion property value. The connector's version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppVersion() {
        return this._appVersion;
    }
    /**
     * Gets the displayName property value. The name of the connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintConnector currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appVersion", (n) -> { currentObject.setAppVersion(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("fullyQualifiedDomainName", (n) -> { currentObject.setFullyQualifiedDomainName(n.getStringValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(PrinterLocation::createFromDiscriminatorValue)); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("registeredDateTime", (n) -> { currentObject.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the fullyQualifiedDomainName property value. The connector machine's hostname.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFullyQualifiedDomainName() {
        return this._fullyQualifiedDomainName;
    }
    /**
     * Gets the location property value. The physical and/or organizational location of the connector.
     * @return a printerLocation
     */
    @javax.annotation.Nullable
    public PrinterLocation getLocation() {
        return this._location;
    }
    /**
     * Gets the operatingSystem property value. The connector machine's operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this._registeredDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("fullyQualifiedDomainName", this.getFullyQualifiedDomainName());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeOffsetDateTimeValue("registeredDateTime", this.getRegisteredDateTime());
    }
    /**
     * Sets the appVersion property value. The connector's version.
     * @param value Value to set for the appVersion property.
     * @return a void
     */
    public void setAppVersion(@javax.annotation.Nullable final String value) {
        this._appVersion = value;
    }
    /**
     * Sets the displayName property value. The name of the connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the fullyQualifiedDomainName property value. The connector machine's hostname.
     * @param value Value to set for the fullyQualifiedDomainName property.
     * @return a void
     */
    public void setFullyQualifiedDomainName(@javax.annotation.Nullable final String value) {
        this._fullyQualifiedDomainName = value;
    }
    /**
     * Sets the location property value. The physical and/or organizational location of the connector.
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final PrinterLocation value) {
        this._location = value;
    }
    /**
     * Sets the operatingSystem property value. The connector machine's operating system version.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @param value Value to set for the registeredDateTime property.
     * @return a void
     */
    public void setRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._registeredDateTime = value;
    }
}
