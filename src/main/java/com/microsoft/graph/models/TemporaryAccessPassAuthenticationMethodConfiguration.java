package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TemporaryAccessPassAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters. */
    private Integer _defaultLength;
    /** Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes and maximumLifetimeInMinutes. */
    private Integer _defaultLifetimeInMinutes;
    /** A collection of users or groups who are enabled to use the authentication method. */
    private java.util.List<AuthenticationMethodTarget> _includeTargets;
    /** If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created to be either one-time use or reusable. */
    private Boolean _isUsableOnce;
    /** Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days). */
    private Integer _maximumLifetimeInMinutes;
    /** Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days). */
    private Integer _minimumLifetimeInMinutes;
    /**
     * Instantiates a new TemporaryAccessPassAuthenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    public TemporaryAccessPassAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TemporaryAccessPassAuthenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static TemporaryAccessPassAuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemporaryAccessPassAuthenticationMethodConfiguration();
    }
    /**
     * Gets the defaultLength property value. Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefaultLength() {
        return this._defaultLength;
    }
    /**
     * Gets the defaultLifetimeInMinutes property value. Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes and maximumLifetimeInMinutes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefaultLifetimeInMinutes() {
        return this._defaultLifetimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TemporaryAccessPassAuthenticationMethodConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultLength", (n) -> { currentObject.setDefaultLength(n.getIntegerValue()); });
            this.put("defaultLifetimeInMinutes", (n) -> { currentObject.setDefaultLifetimeInMinutes(n.getIntegerValue()); });
            this.put("includeTargets", (n) -> { currentObject.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
            this.put("isUsableOnce", (n) -> { currentObject.setIsUsableOnce(n.getBooleanValue()); });
            this.put("maximumLifetimeInMinutes", (n) -> { currentObject.setMaximumLifetimeInMinutes(n.getIntegerValue()); });
            this.put("minimumLifetimeInMinutes", (n) -> { currentObject.setMinimumLifetimeInMinutes(n.getIntegerValue()); });
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
     * Gets the isUsableOnce property value. If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created to be either one-time use or reusable.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUsableOnce() {
        return this._isUsableOnce;
    }
    /**
     * Gets the maximumLifetimeInMinutes property value. Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumLifetimeInMinutes() {
        return this._maximumLifetimeInMinutes;
    }
    /**
     * Gets the minimumLifetimeInMinutes property value. Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumLifetimeInMinutes() {
        return this._minimumLifetimeInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("defaultLength", this.getDefaultLength());
        writer.writeIntegerValue("defaultLifetimeInMinutes", this.getDefaultLifetimeInMinutes());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isUsableOnce", this.getIsUsableOnce());
        writer.writeIntegerValue("maximumLifetimeInMinutes", this.getMaximumLifetimeInMinutes());
        writer.writeIntegerValue("minimumLifetimeInMinutes", this.getMinimumLifetimeInMinutes());
    }
    /**
     * Sets the defaultLength property value. Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters.
     * @param value Value to set for the defaultLength property.
     * @return a void
     */
    public void setDefaultLength(@javax.annotation.Nullable final Integer value) {
        this._defaultLength = value;
    }
    /**
     * Sets the defaultLifetimeInMinutes property value. Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes and maximumLifetimeInMinutes.
     * @param value Value to set for the defaultLifetimeInMinutes property.
     * @return a void
     */
    public void setDefaultLifetimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._defaultLifetimeInMinutes = value;
    }
    /**
     * Sets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
    /**
     * Sets the isUsableOnce property value. If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created to be either one-time use or reusable.
     * @param value Value to set for the isUsableOnce property.
     * @return a void
     */
    public void setIsUsableOnce(@javax.annotation.Nullable final Boolean value) {
        this._isUsableOnce = value;
    }
    /**
     * Sets the maximumLifetimeInMinutes property value. Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @param value Value to set for the maximumLifetimeInMinutes property.
     * @return a void
     */
    public void setMaximumLifetimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._maximumLifetimeInMinutes = value;
    }
    /**
     * Sets the minimumLifetimeInMinutes property value. Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @param value Value to set for the minimumLifetimeInMinutes property.
     * @return a void
     */
    public void setMinimumLifetimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._minimumLifetimeInMinutes = value;
    }
}
