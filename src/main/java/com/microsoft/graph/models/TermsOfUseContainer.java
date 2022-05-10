package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TermsOfUseContainer extends Entity implements Parsable {
    /** Represents the current status of a user's response to a company's customizable terms of use agreement. */
    private java.util.List<AgreementAcceptance> _agreementAcceptances;
    /** Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD). */
    private java.util.List<Agreement> _agreements;
    /**
     * Instantiates a new termsOfUseContainer and sets the default values.
     * @return a void
     */
    public TermsOfUseContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsOfUseContainer
     */
    @javax.annotation.Nonnull
    public static TermsOfUseContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsOfUseContainer();
    }
    /**
     * Gets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @return a agreementAcceptance
     */
    @javax.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAgreementAcceptances() {
        return this._agreementAcceptances;
    }
    /**
     * Gets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD).
     * @return a agreement
     */
    @javax.annotation.Nullable
    public java.util.List<Agreement> getAgreements() {
        return this._agreements;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TermsOfUseContainer currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("agreementAcceptances", (n) -> { currentObject.setAgreementAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
            this.put("agreements", (n) -> { currentObject.setAgreements(n.getCollectionOfObjectValues(Agreement::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agreementAcceptances", this.getAgreementAcceptances());
        writer.writeCollectionOfObjectValues("agreements", this.getAgreements());
    }
    /**
     * Sets the agreementAcceptances property value. Represents the current status of a user's response to a company's customizable terms of use agreement.
     * @param value Value to set for the agreementAcceptances property.
     * @return a void
     */
    public void setAgreementAcceptances(@javax.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this._agreementAcceptances = value;
    }
    /**
     * Sets the agreements property value. Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure AD).
     * @param value Value to set for the agreements property.
     * @return a void
     */
    public void setAgreements(@javax.annotation.Nullable final java.util.List<Agreement> value) {
        this._agreements = value;
    }
}
