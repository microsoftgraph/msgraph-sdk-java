package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LicenseDetails extends Entity implements Parsable {
    /** Information about the service plans assigned with the license. Read-only, Not nullable  */
    private java.util.List<ServicePlanInfo> _servicePlans;
    /** Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only  */
    private String _skuId;
    /** Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only  */
    private String _skuPartNumber;
    /**
     * Instantiates a new licenseDetails and sets the default values.
     * @return a void
     */
    public LicenseDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseDetails
     */
    @javax.annotation.Nonnull
    public static LicenseDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LicenseDetails currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("servicePlans", (n) -> { currentObject.setServicePlans(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
            this.put("skuId", (n) -> { currentObject.setSkuId(n.getStringValue()); });
            this.put("skuPartNumber", (n) -> { currentObject.setSkuPartNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the servicePlans property value. Information about the service plans assigned with the license. Read-only, Not nullable
     * @return a servicePlanInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServicePlans() {
        return this._servicePlans;
    }
    /**
     * Gets the skuId property value. Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this._skuId;
    }
    /**
     * Gets the skuPartNumber property value. Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only
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
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
    }
    /**
     * Sets the servicePlans property value. Information about the service plans assigned with the license. Read-only, Not nullable
     * @param value Value to set for the servicePlans property.
     * @return a void
     */
    public void setServicePlans(@javax.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this._servicePlans = value;
    }
    /**
     * Sets the skuId property value. Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only
     * @param value Value to set for the skuId property.
     * @return a void
     */
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this._skuId = value;
    }
    /**
     * Sets the skuPartNumber property value. Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only
     * @param value Value to set for the skuPartNumber property.
     * @return a void
     */
    public void setSkuPartNumber(@javax.annotation.Nullable final String value) {
        this._skuPartNumber = value;
    }
}
