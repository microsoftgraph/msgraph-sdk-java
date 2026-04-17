package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrCodePinAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new {@link QrCodePinAuthenticationMethodConfiguration} and sets the default values.
     */
    public QrCodePinAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.qrCodePinAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrCodePinAuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static QrCodePinAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrCodePinAuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("pinLength", (n) -> { this.setPinLength(n.getIntegerValue()); });
        deserializerMap.put("standardQRCodeLifetimeInDays", (n) -> { this.setStandardQRCodeLifetimeInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. Groups of users that are included and enabled in the policy.
     * @return a {@link java.util.List<AuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the pinLength property value. The required length of the PIN. The minimum length is 8 digits (as per NIST standards), and the maximum is 20 digits.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPinLength() {
        return this.backingStore.get("pinLength");
    }
    /**
     * Gets the standardQRCodeLifetimeInDays property value. The lifetime of standard QR codes in days. The default is 365 days and the maximum is 395 days (13 months). The minimum is 1 day.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStandardQRCodeLifetimeInDays() {
        return this.backingStore.get("standardQRCodeLifetimeInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeIntegerValue("pinLength", this.getPinLength());
        writer.writeIntegerValue("standardQRCodeLifetimeInDays", this.getStandardQRCodeLifetimeInDays());
    }
    /**
     * Sets the includeTargets property value. Groups of users that are included and enabled in the policy.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the pinLength property value. The required length of the PIN. The minimum length is 8 digits (as per NIST standards), and the maximum is 20 digits.
     * @param value Value to set for the pinLength property.
     */
    public void setPinLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinLength", value);
    }
    /**
     * Sets the standardQRCodeLifetimeInDays property value. The lifetime of standard QR codes in days. The default is 365 days and the maximum is 395 days (13 months). The minimum is 1 day.
     * @param value Value to set for the standardQRCodeLifetimeInDays property.
     */
    public void setStandardQRCodeLifetimeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("standardQRCodeLifetimeInDays", value);
    }
}
