package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * A class containing the properties for iOS Vpp eBook.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVppEBook extends ManagedEBook implements Parsable {
    /**
     * Instantiates a new {@link IosVppEBook} and sets the default values.
     */
    public IosVppEBook() {
        super();
        this.setOdataType("#microsoft.graph.iosVppEBook");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosVppEBook}
     */
    @jakarta.annotation.Nonnull
    public static IosVppEBook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppEBook();
    }
    /**
     * Gets the appleId property value. The Apple ID associated with Vpp token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppleId() {
        return this.backingStore.get("appleId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleId", (n) -> { this.setAppleId(n.getStringValue()); });
        deserializerMap.put("genres", (n) -> { this.setGenres(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("seller", (n) -> { this.setSeller(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("vppOrganizationName", (n) -> { this.setVppOrganizationName(n.getStringValue()); });
        deserializerMap.put("vppTokenId", (n) -> { this.setVppTokenId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the genres property value. Genres.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGenres() {
        return this.backingStore.get("genres");
    }
    /**
     * Gets the language property value. Language.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Gets the seller property value. Seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeller() {
        return this.backingStore.get("seller");
    }
    /**
     * Gets the totalLicenseCount property value. Total license count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. Used license count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.backingStore.get("usedLicenseCount");
    }
    /**
     * Gets the vppOrganizationName property value. The Vpp token&apos;s organization name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVppOrganizationName() {
        return this.backingStore.get("vppOrganizationName");
    }
    /**
     * Gets the vppTokenId property value. The Vpp token ID.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getVppTokenId() {
        return this.backingStore.get("vppTokenId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeCollectionOfPrimitiveValues("genres", this.getGenres());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("seller", this.getSeller());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeStringValue("vppOrganizationName", this.getVppOrganizationName());
        writer.writeUUIDValue("vppTokenId", this.getVppTokenId());
    }
    /**
     * Sets the appleId property value. The Apple ID associated with Vpp token.
     * @param value Value to set for the appleId property.
     */
    public void setAppleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appleId", value);
    }
    /**
     * Sets the genres property value. Genres.
     * @param value Value to set for the genres property.
     */
    public void setGenres(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("genres", value);
    }
    /**
     * Sets the language property value. Language.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the seller property value. Seller.
     * @param value Value to set for the seller property.
     */
    public void setSeller(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("seller", value);
    }
    /**
     * Sets the totalLicenseCount property value. Total license count.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. Used license count.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
    /**
     * Sets the vppOrganizationName property value. The Vpp token&apos;s organization name.
     * @param value Value to set for the vppOrganizationName property.
     */
    public void setVppOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vppOrganizationName", value);
    }
    /**
     * Sets the vppTokenId property value. The Vpp token ID.
     * @param value Value to set for the vppTokenId property.
     */
    public void setVppTokenId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("vppTokenId", value);
    }
}
