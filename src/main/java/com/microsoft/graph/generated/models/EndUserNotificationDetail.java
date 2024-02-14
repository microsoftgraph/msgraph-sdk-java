package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndUserNotificationDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EndUserNotificationDetail} and sets the default values.
     */
    public EndUserNotificationDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndUserNotificationDetail}
     */
    @jakarta.annotation.Nonnull
    public static EndUserNotificationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndUserNotificationDetail();
    }
    /**
     * Gets the emailContent property value. Email HTML content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailContent() {
        return this.backingStore.get("emailContent");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailContent", (n) -> { this.setEmailContent(n.getStringValue()); });
        deserializerMap.put("isDefaultLangauge", (n) -> { this.setIsDefaultLangauge(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("sentFrom", (n) -> { this.setSentFrom(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultLangauge property value. Indicates whether this language is default.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultLangauge() {
        return this.backingStore.get("isDefaultLangauge");
    }
    /**
     * Gets the language property value. Notification language.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Gets the locale property value. Notification locale.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the sentFrom property value. The sentFrom property
     * @return a {@link EmailIdentity}
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getSentFrom() {
        return this.backingStore.get("sentFrom");
    }
    /**
     * Gets the subject property value. Mail subject.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("emailContent", this.getEmailContent());
        writer.writeBooleanValue("isDefaultLangauge", this.getIsDefaultLangauge());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeObjectValue("sentFrom", this.getSentFrom());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the emailContent property value. Email HTML content.
     * @param value Value to set for the emailContent property.
     */
    public void setEmailContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailContent", value);
    }
    /**
     * Sets the isDefaultLangauge property value. Indicates whether this language is default.
     * @param value Value to set for the isDefaultLangauge property.
     */
    public void setIsDefaultLangauge(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultLangauge", value);
    }
    /**
     * Sets the language property value. Notification language.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the locale property value. Notification locale.
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the sentFrom property value. The sentFrom property
     * @param value Value to set for the sentFrom property.
     */
    public void setSentFrom(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("sentFrom", value);
    }
    /**
     * Sets the subject property value. Mail subject.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
}
