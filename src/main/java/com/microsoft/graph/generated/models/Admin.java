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
public class Admin implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Admin} and sets the default values.
     */
    public Admin() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Admin}
     */
    @jakarta.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
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
     * Gets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @return a {@link Edge}
     */
    @jakarta.annotation.Nullable
    public Edge getEdge() {
        return this.backingStore.get("edge");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("edge", (n) -> { this.setEdge(n.getObjectValue(Edge::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoft365Apps", (n) -> { this.setMicrosoft365Apps(n.getObjectValue(AdminMicrosoft365Apps::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("people", (n) -> { this.setPeople(n.getObjectValue(PeopleAdminSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reportSettings", (n) -> { this.setReportSettings(n.getObjectValue(AdminReportSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAnnouncement", (n) -> { this.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(Sharepoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the microsoft365Apps property value. A container for the Microsoft 365 apps admin functionality.
     * @return a {@link AdminMicrosoft365Apps}
     */
    @jakarta.annotation.Nullable
    public AdminMicrosoft365Apps getMicrosoft365Apps() {
        return this.backingStore.get("microsoft365Apps");
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
     * Gets the people property value. Represents a setting to control people-related admin settings in the tenant.
     * @return a {@link PeopleAdminSettings}
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings getPeople() {
        return this.backingStore.get("people");
    }
    /**
     * Gets the reportSettings property value. A container for administrative resources to manage reports.
     * @return a {@link AdminReportSettings}
     */
    @jakarta.annotation.Nullable
    public AdminReportSettings getReportSettings() {
        return this.backingStore.get("reportSettings");
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a {@link ServiceAnnouncement}
     */
    @jakarta.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this.backingStore.get("serviceAnnouncement");
    }
    /**
     * Gets the sharepoint property value. The sharepoint property
     * @return a {@link Sharepoint}
     */
    @jakarta.annotation.Nullable
    public Sharepoint getSharepoint() {
        return this.backingStore.get("sharepoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("edge", this.getEdge());
        writer.writeObjectValue("microsoft365Apps", this.getMicrosoft365Apps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("people", this.getPeople());
        writer.writeObjectValue("reportSettings", this.getReportSettings());
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
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
     * Sets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @param value Value to set for the edge property.
     */
    public void setEdge(@jakarta.annotation.Nullable final Edge value) {
        this.backingStore.set("edge", value);
    }
    /**
     * Sets the microsoft365Apps property value. A container for the Microsoft 365 apps admin functionality.
     * @param value Value to set for the microsoft365Apps property.
     */
    public void setMicrosoft365Apps(@jakarta.annotation.Nullable final AdminMicrosoft365Apps value) {
        this.backingStore.set("microsoft365Apps", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the people property value. Represents a setting to control people-related admin settings in the tenant.
     * @param value Value to set for the people property.
     */
    public void setPeople(@jakarta.annotation.Nullable final PeopleAdminSettings value) {
        this.backingStore.set("people", value);
    }
    /**
     * Sets the reportSettings property value. A container for administrative resources to manage reports.
     * @param value Value to set for the reportSettings property.
     */
    public void setReportSettings(@jakarta.annotation.Nullable final AdminReportSettings value) {
        this.backingStore.set("reportSettings", value);
    }
    /**
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     */
    public void setServiceAnnouncement(@jakarta.annotation.Nullable final ServiceAnnouncement value) {
        this.backingStore.set("serviceAnnouncement", value);
    }
    /**
     * Sets the sharepoint property value. The sharepoint property
     * @param value Value to set for the sharepoint property.
     */
    public void setSharepoint(@jakarta.annotation.Nullable final Sharepoint value) {
        this.backingStore.set("sharepoint", value);
    }
}
