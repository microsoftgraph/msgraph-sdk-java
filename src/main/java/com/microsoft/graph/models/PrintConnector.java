package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintConnector extends Entity implements Parsable {
    /**
     * The connector's version.
     */
    private String appVersion;
    /**
     * The name of the connector.
     */
    private String displayName;
    /**
     * The connector machine's hostname.
     */
    private String fullyQualifiedDomainName;
    /**
     * The physical and/or organizational location of the connector.
     */
    private PrinterLocation location;
    /**
     * The connector machine's operating system version.
     */
    private String operatingSystem;
    /**
     * The DateTimeOffset when the connector was registered.
     */
    private OffsetDateTime registeredDateTime;
    /**
     * Instantiates a new printConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.appVersion;
    }
    /**
     * Gets the displayName property value. The name of the connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appVersion", (n) -> { this.setAppVersion(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fullyQualifiedDomainName", (n) -> { this.setFullyQualifiedDomainName(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PrinterLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("registeredDateTime", (n) -> { this.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullyQualifiedDomainName property value. The connector machine's hostname.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * Gets the location property value. The physical and/or organizational location of the connector.
     * @return a printerLocation
     */
    @javax.annotation.Nullable
    public PrinterLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the operatingSystem property value. The connector machine's operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Gets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.registeredDateTime;
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
    @javax.annotation.Nonnull
    public void setAppVersion(@javax.annotation.Nullable final String value) {
        this.appVersion = value;
    }
    /**
     * Sets the displayName property value. The name of the connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the fullyQualifiedDomainName property value. The connector machine's hostname.
     * @param value Value to set for the fullyQualifiedDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullyQualifiedDomainName(@javax.annotation.Nullable final String value) {
        this.fullyQualifiedDomainName = value;
    }
    /**
     * Sets the location property value. The physical and/or organizational location of the connector.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final PrinterLocation value) {
        this.location = value;
    }
    /**
     * Sets the operatingSystem property value. The connector machine's operating system version.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this.operatingSystem = value;
    }
    /**
     * Sets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @param value Value to set for the registeredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.registeredDateTime = value;
    }
}
