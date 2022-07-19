package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityGovernance implements AdditionalDataHolder, Parsable {
    /** The accessReviews property */
    private AccessReviewSet _accessReviews;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appConsent property */
    private AppConsentApprovalRoute _appConsent;
    /** The entitlementManagement property */
    private EntitlementManagement _entitlementManagement;
    /** The OdataType property */
    private String _odataType;
    /** The termsOfUse property */
    private TermsOfUseContainer _termsOfUse;
    /**
     * Instantiates a new IdentityGovernance and sets the default values.
     * @return a void
     */
    public IdentityGovernance() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.identityGovernance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityGovernance
     */
    @javax.annotation.Nonnull
    public static IdentityGovernance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityGovernance();
    }
    /**
     * Gets the accessReviews property value. The accessReviews property
     * @return a accessReviewSet
     */
    @javax.annotation.Nullable
    public AccessReviewSet getAccessReviews() {
        return this._accessReviews;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appConsent property value. The appConsent property
     * @return a appConsentApprovalRoute
     */
    @javax.annotation.Nullable
    public AppConsentApprovalRoute getAppConsent() {
        return this._appConsent;
    }
    /**
     * Gets the entitlementManagement property value. The entitlementManagement property
     * @return a entitlementManagement
     */
    @javax.annotation.Nullable
    public EntitlementManagement getEntitlementManagement() {
        return this._entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityGovernance currentObject = this;
        return new HashMap<>(5) {{
            this.put("accessReviews", (n) -> { currentObject.setAccessReviews(n.getObjectValue(AccessReviewSet::createFromDiscriminatorValue)); });
            this.put("appConsent", (n) -> { currentObject.setAppConsent(n.getObjectValue(AppConsentApprovalRoute::createFromDiscriminatorValue)); });
            this.put("entitlementManagement", (n) -> { currentObject.setEntitlementManagement(n.getObjectValue(EntitlementManagement::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("termsOfUse", (n) -> { currentObject.setTermsOfUse(n.getObjectValue(TermsOfUseContainer::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the termsOfUse property value. The termsOfUse property
     * @return a termsOfUseContainer
     */
    @javax.annotation.Nullable
    public TermsOfUseContainer getTermsOfUse() {
        return this._termsOfUse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviews", this.getAccessReviews());
        writer.writeObjectValue("appConsent", this.getAppConsent());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviews property value. The accessReviews property
     * @param value Value to set for the accessReviews property.
     * @return a void
     */
    public void setAccessReviews(@javax.annotation.Nullable final AccessReviewSet value) {
        this._accessReviews = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appConsent property value. The appConsent property
     * @param value Value to set for the appConsent property.
     * @return a void
     */
    public void setAppConsent(@javax.annotation.Nullable final AppConsentApprovalRoute value) {
        this._appConsent = value;
    }
    /**
     * Sets the entitlementManagement property value. The entitlementManagement property
     * @param value Value to set for the entitlementManagement property.
     * @return a void
     */
    public void setEntitlementManagement(@javax.annotation.Nullable final EntitlementManagement value) {
        this._entitlementManagement = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the termsOfUse property value. The termsOfUse property
     * @param value Value to set for the termsOfUse property.
     * @return a void
     */
    public void setTermsOfUse(@javax.annotation.Nullable final TermsOfUseContainer value) {
        this._termsOfUse = value;
    }
}
