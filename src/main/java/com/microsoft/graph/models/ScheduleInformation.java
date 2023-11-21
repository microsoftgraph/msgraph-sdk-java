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
public class ScheduleInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ScheduleInformation and sets the default values.
     */
    public ScheduleInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScheduleInformation
     */
    @jakarta.annotation.Nonnull
    public static ScheduleInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleInformation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the availabilityView property value. Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAvailabilityView() {
        return this.backingStore.get("availabilityView");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the error property value. Error information from attempting to get the availability of the user, distribution list, or resource.
     * @return a FreeBusyError
     */
    @jakarta.annotation.Nullable
    public FreeBusyError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("availabilityView", (n) -> { this.setAvailabilityView(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(FreeBusyError::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scheduleId", (n) -> { this.setScheduleId(n.getStringValue()); });
        deserializerMap.put("scheduleItems", (n) -> { this.setScheduleItems(n.getCollectionOfObjectValues(ScheduleItem::createFromDiscriminatorValue)); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getObjectValue(WorkingHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the scheduleId property value. An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScheduleId() {
        return this.backingStore.get("scheduleId");
    }
    /**
     * Gets the scheduleItems property value. Contains the items that describe the availability of the user or resource.
     * @return a java.util.List<ScheduleItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScheduleItem> getScheduleItems() {
        return this.backingStore.get("scheduleItems");
    }
    /**
     * Gets the workingHours property value. The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     * @return a WorkingHours
     */
    @jakarta.annotation.Nullable
    public WorkingHours getWorkingHours() {
        return this.backingStore.get("workingHours");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availabilityView", this.getAvailabilityView());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("scheduleId", this.getScheduleId());
        writer.writeCollectionOfObjectValues("scheduleItems", this.getScheduleItems());
        writer.writeObjectValue("workingHours", this.getWorkingHours());
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
     * Sets the availabilityView property value. Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     * @param value Value to set for the availabilityView property.
     */
    public void setAvailabilityView(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("availabilityView", value);
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
     * Sets the error property value. Error information from attempting to get the availability of the user, distribution list, or resource.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final FreeBusyError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the scheduleId property value. An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     * @param value Value to set for the scheduleId property.
     */
    public void setScheduleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scheduleId", value);
    }
    /**
     * Sets the scheduleItems property value. Contains the items that describe the availability of the user or resource.
     * @param value Value to set for the scheduleItems property.
     */
    public void setScheduleItems(@jakarta.annotation.Nullable final java.util.List<ScheduleItem> value) {
        this.backingStore.set("scheduleItems", value);
    }
    /**
     * Sets the workingHours property value. The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     * @param value Value to set for the workingHours property.
     */
    public void setWorkingHours(@jakarta.annotation.Nullable final WorkingHours value) {
        this.backingStore.set("workingHours", value);
    }
}
