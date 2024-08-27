package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SolutionsRoot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SolutionsRoot} and sets the default values.
     */
    public SolutionsRoot() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SolutionsRoot}
     */
    @jakarta.annotation.Nonnull
    public static SolutionsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SolutionsRoot();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the backupRestore property value. The backupRestore property
     * @return a {@link BackupRestoreRoot}
     */
    @jakarta.annotation.Nullable
    public BackupRestoreRoot getBackupRestore() {
        return this.backingStore.get("backupRestore");
    }
    /**
     * Gets the bookingBusinesses property value. The bookingBusinesses property
     * @return a {@link java.util.List<BookingBusiness>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingBusiness> getBookingBusinesses() {
        return this.backingStore.get("bookingBusinesses");
    }
    /**
     * Gets the bookingCurrencies property value. The bookingCurrencies property
     * @return a {@link java.util.List<BookingCurrency>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCurrency> getBookingCurrencies() {
        return this.backingStore.get("bookingCurrencies");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("backupRestore", (n) -> { this.setBackupRestore(n.getObjectValue(BackupRestoreRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("bookingBusinesses", (n) -> { this.setBookingBusinesses(n.getCollectionOfObjectValues(BookingBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("bookingCurrencies", (n) -> { this.setBookingCurrencies(n.getCollectionOfObjectValues(BookingCurrency::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("virtualEvents", (n) -> { this.setVirtualEvents(n.getObjectValue(VirtualEventsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the virtualEvents property value. The virtualEvents property
     * @return a {@link VirtualEventsRoot}
     */
    @jakarta.annotation.Nullable
    public VirtualEventsRoot getVirtualEvents() {
        return this.backingStore.get("virtualEvents");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("backupRestore", this.getBackupRestore());
        writer.writeCollectionOfObjectValues("bookingBusinesses", this.getBookingBusinesses());
        writer.writeCollectionOfObjectValues("bookingCurrencies", this.getBookingCurrencies());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("virtualEvents", this.getVirtualEvents());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the backupRestore property value. The backupRestore property
     * @param value Value to set for the backupRestore property.
     */
    public void setBackupRestore(@jakarta.annotation.Nullable final BackupRestoreRoot value) {
        this.backingStore.set("backupRestore", value);
    }
    /**
     * Sets the bookingBusinesses property value. The bookingBusinesses property
     * @param value Value to set for the bookingBusinesses property.
     */
    public void setBookingBusinesses(@jakarta.annotation.Nullable final java.util.List<BookingBusiness> value) {
        this.backingStore.set("bookingBusinesses", value);
    }
    /**
     * Sets the bookingCurrencies property value. The bookingCurrencies property
     * @param value Value to set for the bookingCurrencies property.
     */
    public void setBookingCurrencies(@jakarta.annotation.Nullable final java.util.List<BookingCurrency> value) {
        this.backingStore.set("bookingCurrencies", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the virtualEvents property value. The virtualEvents property
     * @param value Value to set for the virtualEvents property.
     */
    public void setVirtualEvents(@jakarta.annotation.Nullable final VirtualEventsRoot value) {
        this.backingStore.set("virtualEvents", value);
    }
}
