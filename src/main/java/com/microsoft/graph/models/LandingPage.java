package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LandingPage extends Entity implements Parsable {
    /**
     * The createdBy property
     */
    private EmailIdentity createdBy;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The details property
     */
    private java.util.List<LandingPageDetail> details;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The lastModifiedBy property
     */
    private EmailIdentity lastModifiedBy;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The locale property
     */
    private String locale;
    /**
     * The source property
     */
    private SimulationContentSource source;
    /**
     * The status property
     */
    private SimulationContentStatus status;
    /**
     * The supportedLocales property
     */
    private java.util.List<String> supportedLocales;
    /**
     * Instantiates a new LandingPage and sets the default values.
     */
    public LandingPage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LandingPage
     */
    @jakarta.annotation.Nonnull
    public static LandingPage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LandingPage();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the details property value. The details property
     * @return a java.util.List<LandingPageDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LandingPageDetail> getDetails() {
        return this.details;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(LandingPageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationContentStatus.class)); });
        deserializerMap.put("supportedLocales", (n) -> { this.setSupportedLocales(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the locale property value. The locale property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.locale;
    }
    /**
     * Gets the source property value. The source property
     * @return a SimulationContentSource
     */
    @jakarta.annotation.Nullable
    public SimulationContentSource getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. The status property
     * @return a SimulationContentStatus
     */
    @jakarta.annotation.Nullable
    public SimulationContentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the supportedLocales property value. The supportedLocales property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedLocales() {
        return this.supportedLocales;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("supportedLocales", this.getSupportedLocales());
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<LandingPageDetail> value) {
        this.details = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the locale property value. The locale property
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.locale = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.source = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationContentStatus value) {
        this.status = value;
    }
    /**
     * Sets the supportedLocales property value. The supportedLocales property
     * @param value Value to set for the supportedLocales property.
     */
    public void setSupportedLocales(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedLocales = value;
    }
}
