package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintConnector extends Entity implements Parsable {
    /**
     * Instantiates a new PrintConnector and sets the default values.
     */
    public PrintConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintConnector
     */
    @jakarta.annotation.Nonnull
    public static PrintConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintConnector();
    }
    /**
     * Gets the appVersion property value. The connector's version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppVersion() {
        return this.BackingStore.get("appVersion");
    }
    /**
     * Gets the displayName property value. The name of the connector.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFullyQualifiedDomainName() {
        return this.BackingStore.get("fullyQualifiedDomainName");
    }
    /**
     * Gets the location property value. The physical and/or organizational location of the connector.
     * @return a PrinterLocation
     */
    @jakarta.annotation.Nullable
    public PrinterLocation getLocation() {
        return this.BackingStore.get("location");
    }
    /**
     * Gets the operatingSystem property value. The connector machine's operating system version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.BackingStore.get("operatingSystem");
    }
    /**
     * Gets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.BackingStore.get("registeredDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appVersion", value);
    }
    /**
     * Sets the displayName property value. The name of the connector.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the fullyQualifiedDomainName property value. The connector machine's hostname.
     * @param value Value to set for the fullyQualifiedDomainName property.
     */
    public void setFullyQualifiedDomainName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fullyQualifiedDomainName", value);
    }
    /**
     * Sets the location property value. The physical and/or organizational location of the connector.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PrinterLocation value) {
        this.BackingStore.set("location", value);
    }
    /**
     * Sets the operatingSystem property value. The connector machine's operating system version.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("operatingSystem", value);
    }
    /**
     * Sets the registeredDateTime property value. The DateTimeOffset when the connector was registered.
     * @param value Value to set for the registeredDateTime property.
     */
    public void setRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("registeredDateTime", value);
    }
}
