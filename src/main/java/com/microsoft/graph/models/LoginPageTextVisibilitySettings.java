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
public class LoginPageTextVisibilitySettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new LoginPageTextVisibilitySettings and sets the default values.
     */
    public LoginPageTextVisibilitySettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LoginPageTextVisibilitySettings
     */
    @jakarta.annotation.Nonnull
    public static LoginPageTextVisibilitySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginPageTextVisibilitySettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the hideAccountResetCredentials property value. Option to hide the self-service password reset (SSPR) hyperlinks such as 'Can't access your account?', 'Forgot my password' and 'Reset it now' on the sign-in form.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideAccountResetCredentials() {
        return this.BackingStore.get("hideAccountResetCredentials");
    }
    /**
     * Gets the hideCannotAccessYourAccount property value. Option to hide the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in form.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideCannotAccessYourAccount() {
        return this.BackingStore.get("hideCannotAccessYourAccount");
    }
    /**
     * Gets the hideForgotMyPassword property value. Option to hide the self-service password reset (SSPR) 'Forgot my password' hyperlink on the sign-in form.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideForgotMyPassword() {
        return this.BackingStore.get("hideForgotMyPassword");
    }
    /**
     * Gets the hidePrivacyAndCookies property value. Option to hide the 'Privacy & Cookies' hyperlink in the footer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidePrivacyAndCookies() {
        return this.BackingStore.get("hidePrivacyAndCookies");
    }
    /**
     * Gets the hideResetItNow property value. Option to hide the self-service password reset (SSPR) 'reset it now' hyperlink on the sign-in form.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideResetItNow() {
        return this.BackingStore.get("hideResetItNow");
    }
    /**
     * Gets the hideTermsOfUse property value. Option to hide the 'Terms of Use' hyperlink in the footer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideTermsOfUse() {
        return this.BackingStore.get("hideTermsOfUse");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the hideAccountResetCredentials property value. Option to hide the self-service password reset (SSPR) hyperlinks such as 'Can't access your account?', 'Forgot my password' and 'Reset it now' on the sign-in form.
     * @param value Value to set for the hideAccountResetCredentials property.
     */
    public void setHideAccountResetCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideAccountResetCredentials", value);
    }
    /**
     * Sets the hideCannotAccessYourAccount property value. Option to hide the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in form.
     * @param value Value to set for the hideCannotAccessYourAccount property.
     */
    public void setHideCannotAccessYourAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideCannotAccessYourAccount", value);
    }
    /**
     * Sets the hideForgotMyPassword property value. Option to hide the self-service password reset (SSPR) 'Forgot my password' hyperlink on the sign-in form.
     * @param value Value to set for the hideForgotMyPassword property.
     */
    public void setHideForgotMyPassword(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideForgotMyPassword", value);
    }
    /**
     * Sets the hidePrivacyAndCookies property value. Option to hide the 'Privacy & Cookies' hyperlink in the footer.
     * @param value Value to set for the hidePrivacyAndCookies property.
     */
    public void setHidePrivacyAndCookies(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hidePrivacyAndCookies", value);
    }
    /**
     * Sets the hideResetItNow property value. Option to hide the self-service password reset (SSPR) 'reset it now' hyperlink on the sign-in form.
     * @param value Value to set for the hideResetItNow property.
     */
    public void setHideResetItNow(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideResetItNow", value);
    }
    /**
     * Sets the hideTermsOfUse property value. Option to hide the 'Terms of Use' hyperlink in the footer.
     * @param value Value to set for the hideTermsOfUse property.
     */
    public void setHideTermsOfUse(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hideTermsOfUse", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
