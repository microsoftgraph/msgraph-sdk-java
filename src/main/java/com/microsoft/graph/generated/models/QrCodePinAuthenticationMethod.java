package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrCodePinAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link QrCodePinAuthenticationMethod} and sets the default values.
     */
    public QrCodePinAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.qrCodePinAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrCodePinAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static QrCodePinAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrCodePinAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("pin", (n) -> { this.setPin(n.getObjectValue(QrPin::createFromDiscriminatorValue)); });
        deserializerMap.put("standardQRCode", (n) -> { this.setStandardQRCode(n.getObjectValue(QrCode::createFromDiscriminatorValue)); });
        deserializerMap.put("temporaryQRCode", (n) -> { this.setTemporaryQRCode(n.getObjectValue(QrCode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pin property value. The PIN associated with this QR code authentication method.
     * @return a {@link QrPin}
     */
    @jakarta.annotation.Nullable
    public QrPin getPin() {
        return this.backingStore.get("pin");
    }
    /**
     * Gets the standardQRCode property value. The standard (long-lived) QR code credential, typically printed on a user&apos;s badge.
     * @return a {@link QrCode}
     */
    @jakarta.annotation.Nullable
    public QrCode getStandardQRCode() {
        return this.backingStore.get("standardQRCode");
    }
    /**
     * Gets the temporaryQRCode property value. A temporary (short-lived) QR code credential, created when a user forgets their badge.
     * @return a {@link QrCode}
     */
    @jakarta.annotation.Nullable
    public QrCode getTemporaryQRCode() {
        return this.backingStore.get("temporaryQRCode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("pin", this.getPin());
        writer.writeObjectValue("standardQRCode", this.getStandardQRCode());
        writer.writeObjectValue("temporaryQRCode", this.getTemporaryQRCode());
    }
    /**
     * Sets the pin property value. The PIN associated with this QR code authentication method.
     * @param value Value to set for the pin property.
     */
    public void setPin(@jakarta.annotation.Nullable final QrPin value) {
        this.backingStore.set("pin", value);
    }
    /**
     * Sets the standardQRCode property value. The standard (long-lived) QR code credential, typically printed on a user&apos;s badge.
     * @param value Value to set for the standardQRCode property.
     */
    public void setStandardQRCode(@jakarta.annotation.Nullable final QrCode value) {
        this.backingStore.set("standardQRCode", value);
    }
    /**
     * Sets the temporaryQRCode property value. A temporary (short-lived) QR code credential, created when a user forgets their badge.
     * @param value Value to set for the temporaryQRCode property.
     */
    public void setTemporaryQRCode(@jakarta.annotation.Nullable final QrCode value) {
        this.backingStore.set("temporaryQRCode", value);
    }
}
