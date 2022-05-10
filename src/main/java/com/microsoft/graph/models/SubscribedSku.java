package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubscribedSku extends Entity implements Parsable {
    /** For example, 'User' or 'Company'. */
    private String _appliesTo;
    /** Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut. The capabilityStatus is Enabled if the prepaidUnits property has at least 1 unit that is enabled, and LockedOut if the customer cancelled their subscription. */
    private String _capabilityStatus;
    /** The number of licenses that have been assigned. */
    private Integer _consumedUnits;
    /** Information about the number and status of prepaid licenses. */
    private LicenseUnitsDetail _prepaidUnits;
    /** Information about the service plans that are available with the SKU. Not nullable */
    private java.util.List<ServicePlanInfo> _servicePlans;
    /** The unique identifier (GUID) for the service SKU. */
    private String _skuId;
    /** The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus. */
    private String _skuPartNumber;
    /**
     * Instantiates a new subscribedSku and sets the default values.
     * @return a void
     */
    public SubscribedSku() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subscribedSku
     */
    @javax.annotation.Nonnull
    public static SubscribedSku createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscribedSku();
    }
    /**
     * Gets the appliesTo property value. For example, 'User' or 'Company'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * Gets the capabilityStatus property value. Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut. The capabilityStatus is Enabled if the prepaidUnits property has at least 1 unit that is enabled, and LockedOut if the customer cancelled their subscription.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCapabilityStatus() {
        return this._capabilityStatus;
    }
    /**
     * Gets the consumedUnits property value. The number of licenses that have been assigned.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConsumedUnits() {
        return this._consumedUnits;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubscribedSku currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getStringValue()); });
            this.put("capabilityStatus", (n) -> { currentObject.setCapabilityStatus(n.getStringValue()); });
            this.put("consumedUnits", (n) -> { currentObject.setConsumedUnits(n.getIntegerValue()); });
            this.put("prepaidUnits", (n) -> { currentObject.setPrepaidUnits(n.getObjectValue(LicenseUnitsDetail::createFromDiscriminatorValue)); });
            this.put("servicePlans", (n) -> { currentObject.setServicePlans(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
            this.put("skuId", (n) -> { currentObject.setSkuId(n.getStringValue()); });
            this.put("skuPartNumber", (n) -> { currentObject.setSkuPartNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the prepaidUnits property value. Information about the number and status of prepaid licenses.
     * @return a licenseUnitsDetail
     */
    @javax.annotation.Nullable
    public LicenseUnitsDetail getPrepaidUnits() {
        return this._prepaidUnits;
    }
    /**
     * Gets the servicePlans property value. Information about the service plans that are available with the SKU. Not nullable
     * @return a servicePlanInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServicePlans() {
        return this._servicePlans;
    }
    /**
     * Gets the skuId property value. The unique identifier (GUID) for the service SKU.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this._skuId;
    }
    /**
     * Gets the skuPartNumber property value. The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuPartNumber() {
        return this._skuPartNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("capabilityStatus", this.getCapabilityStatus());
        writer.writeIntegerValue("consumedUnits", this.getConsumedUnits());
        writer.writeObjectValue("prepaidUnits", this.getPrepaidUnits());
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
    }
    /**
     * Sets the appliesTo property value. For example, 'User' or 'Company'.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    public void setAppliesTo(@javax.annotation.Nullable final String value) {
        this._appliesTo = value;
    }
    /**
     * Sets the capabilityStatus property value. Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut. The capabilityStatus is Enabled if the prepaidUnits property has at least 1 unit that is enabled, and LockedOut if the customer cancelled their subscription.
     * @param value Value to set for the capabilityStatus property.
     * @return a void
     */
    public void setCapabilityStatus(@javax.annotation.Nullable final String value) {
        this._capabilityStatus = value;
    }
    /**
     * Sets the consumedUnits property value. The number of licenses that have been assigned.
     * @param value Value to set for the consumedUnits property.
     * @return a void
     */
    public void setConsumedUnits(@javax.annotation.Nullable final Integer value) {
        this._consumedUnits = value;
    }
    /**
     * Sets the prepaidUnits property value. Information about the number and status of prepaid licenses.
     * @param value Value to set for the prepaidUnits property.
     * @return a void
     */
    public void setPrepaidUnits(@javax.annotation.Nullable final LicenseUnitsDetail value) {
        this._prepaidUnits = value;
    }
    /**
     * Sets the servicePlans property value. Information about the service plans that are available with the SKU. Not nullable
     * @param value Value to set for the servicePlans property.
     * @return a void
     */
    public void setServicePlans(@javax.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this._servicePlans = value;
    }
    /**
     * Sets the skuId property value. The unique identifier (GUID) for the service SKU.
     * @param value Value to set for the skuId property.
     * @return a void
     */
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this._skuId = value;
    }
    /**
     * Sets the skuPartNumber property value. The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     * @param value Value to set for the skuPartNumber property.
     * @return a void
     */
    public void setSkuPartNumber(@javax.annotation.Nullable final String value) {
        this._skuPartNumber = value;
    }
}
