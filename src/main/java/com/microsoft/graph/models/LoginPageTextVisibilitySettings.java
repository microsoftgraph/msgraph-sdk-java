package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LoginPageTextVisibilitySettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hideAccountResetCredentials property
     */
    private Boolean hideAccountResetCredentials;
    /**
     * The hideCannotAccessYourAccount property
     */
    private Boolean hideCannotAccessYourAccount;
    /**
     * The hideForgotMyPassword property
     */
    private Boolean hideForgotMyPassword;
    /**
     * The hidePrivacyAndCookies property
     */
    private Boolean hidePrivacyAndCookies;
    /**
     * The hideResetItNow property
     */
    private Boolean hideResetItNow;
    /**
     * The hideTermsOfUse property
     */
    private Boolean hideTermsOfUse;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new loginPageTextVisibilitySettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LoginPageTextVisibilitySettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a loginPageTextVisibilitySettings
     */
    @javax.annotation.Nonnull
    public static LoginPageTextVisibilitySettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginPageTextVisibilitySettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("hideAccountResetCredentials", (n) -> { this.setHideAccountResetCredentials(n.getBooleanValue()); });
        deserializerMap.put("hideCannotAccessYourAccount", (n) -> { this.setHideCannotAccessYourAccount(n.getBooleanValue()); });
        deserializerMap.put("hideForgotMyPassword", (n) -> { this.setHideForgotMyPassword(n.getBooleanValue()); });
        deserializerMap.put("hidePrivacyAndCookies", (n) -> { this.setHidePrivacyAndCookies(n.getBooleanValue()); });
        deserializerMap.put("hideResetItNow", (n) -> { this.setHideResetItNow(n.getBooleanValue()); });
        deserializerMap.put("hideTermsOfUse", (n) -> { this.setHideTermsOfUse(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hideAccountResetCredentials property value. The hideAccountResetCredentials property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideAccountResetCredentials() {
        return this.hideAccountResetCredentials;
    }
    /**
     * Gets the hideCannotAccessYourAccount property value. The hideCannotAccessYourAccount property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideCannotAccessYourAccount() {
        return this.hideCannotAccessYourAccount;
    }
    /**
     * Gets the hideForgotMyPassword property value. The hideForgotMyPassword property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideForgotMyPassword() {
        return this.hideForgotMyPassword;
    }
    /**
     * Gets the hidePrivacyAndCookies property value. The hidePrivacyAndCookies property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidePrivacyAndCookies() {
        return this.hidePrivacyAndCookies;
    }
    /**
     * Gets the hideResetItNow property value. The hideResetItNow property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideResetItNow() {
        return this.hideResetItNow;
    }
    /**
     * Gets the hideTermsOfUse property value. The hideTermsOfUse property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideTermsOfUse() {
        return this.hideTermsOfUse;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hideAccountResetCredentials", this.getHideAccountResetCredentials());
        writer.writeBooleanValue("hideCannotAccessYourAccount", this.getHideCannotAccessYourAccount());
        writer.writeBooleanValue("hideForgotMyPassword", this.getHideForgotMyPassword());
        writer.writeBooleanValue("hidePrivacyAndCookies", this.getHidePrivacyAndCookies());
        writer.writeBooleanValue("hideResetItNow", this.getHideResetItNow());
        writer.writeBooleanValue("hideTermsOfUse", this.getHideTermsOfUse());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hideAccountResetCredentials property value. The hideAccountResetCredentials property
     * @param value Value to set for the hideAccountResetCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideAccountResetCredentials(@javax.annotation.Nullable final Boolean value) {
        this.hideAccountResetCredentials = value;
    }
    /**
     * Sets the hideCannotAccessYourAccount property value. The hideCannotAccessYourAccount property
     * @param value Value to set for the hideCannotAccessYourAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideCannotAccessYourAccount(@javax.annotation.Nullable final Boolean value) {
        this.hideCannotAccessYourAccount = value;
    }
    /**
     * Sets the hideForgotMyPassword property value. The hideForgotMyPassword property
     * @param value Value to set for the hideForgotMyPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideForgotMyPassword(@javax.annotation.Nullable final Boolean value) {
        this.hideForgotMyPassword = value;
    }
    /**
     * Sets the hidePrivacyAndCookies property value. The hidePrivacyAndCookies property
     * @param value Value to set for the hidePrivacyAndCookies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidePrivacyAndCookies(@javax.annotation.Nullable final Boolean value) {
        this.hidePrivacyAndCookies = value;
    }
    /**
     * Sets the hideResetItNow property value. The hideResetItNow property
     * @param value Value to set for the hideResetItNow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideResetItNow(@javax.annotation.Nullable final Boolean value) {
        this.hideResetItNow = value;
    }
    /**
     * Sets the hideTermsOfUse property value. The hideTermsOfUse property
     * @param value Value to set for the hideTermsOfUse property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideTermsOfUse(@javax.annotation.Nullable final Boolean value) {
        this.hideTermsOfUse = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
