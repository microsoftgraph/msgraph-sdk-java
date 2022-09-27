package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** Determines whether email OTP is usable by external users for authentication. Possible values are: default, enabled, disabled, unknownFutureValue. Tenants in the default state who did not use public preview will automatically have email OTP enabled beginning in October 2021. */
    private ExternalEmailOtpState _allowExternalIdToUseEmailOtp;
    /** A collection of users or groups who are enabled to use the authentication method. */
    private java.util.List<AuthenticationMethodTarget> _includeTargets;
    /**
     * Instantiates a new EmailAuthenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    public EmailAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.emailAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailAuthenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static EmailAuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailAuthenticationMethodConfiguration();
    }
    /**
     * Gets the allowExternalIdToUseEmailOtp property value. Determines whether email OTP is usable by external users for authentication. Possible values are: default, enabled, disabled, unknownFutureValue. Tenants in the default state who did not use public preview will automatically have email OTP enabled beginning in October 2021.
     * @return a externalEmailOtpState
     */
    @javax.annotation.Nullable
    public ExternalEmailOtpState getAllowExternalIdToUseEmailOtp() {
        return this._allowExternalIdToUseEmailOtp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmailAuthenticationMethodConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowExternalIdToUseEmailOtp", (n) -> { currentObject.setAllowExternalIdToUseEmailOtp(n.getEnumValue(ExternalEmailOtpState.class)); });
            this.put("includeTargets", (n) -> { currentObject.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @return a authenticationMethodTarget
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this._includeTargets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowExternalIdToUseEmailOtp", this.getAllowExternalIdToUseEmailOtp());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
    }
    /**
     * Sets the allowExternalIdToUseEmailOtp property value. Determines whether email OTP is usable by external users for authentication. Possible values are: default, enabled, disabled, unknownFutureValue. Tenants in the default state who did not use public preview will automatically have email OTP enabled beginning in October 2021.
     * @param value Value to set for the allowExternalIdToUseEmailOtp property.
     * @return a void
     */
    public void setAllowExternalIdToUseEmailOtp(@javax.annotation.Nullable final ExternalEmailOtpState value) {
        this._allowExternalIdToUseEmailOtp = value;
    }
    /**
     * Sets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
}
