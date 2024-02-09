package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInFrequencySessionControl extends ConditionalAccessSessionControl implements Parsable {
    /**
     * Instantiates a new {@link SignInFrequencySessionControl} and sets the default values.
     */
    public SignInFrequencySessionControl() {
        super();
        this.setOdataType("#microsoft.graph.signInFrequencySessionControl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SignInFrequencySessionControl}
     */
    @jakarta.annotation.Nonnull
    public static SignInFrequencySessionControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInFrequencySessionControl();
    }
    /**
     * Gets the authenticationType property value. The possible values are primaryAndSecondaryAuthentication, secondaryAuthentication, unknownFutureValue.
     * @return a {@link SignInFrequencyAuthenticationType}
     */
    @jakarta.annotation.Nullable
    public SignInFrequencyAuthenticationType getAuthenticationType() {
        return this.backingStore.get("authenticationType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getEnumValue(SignInFrequencyAuthenticationType::forValue)); });
        deserializerMap.put("frequencyInterval", (n) -> { this.setFrequencyInterval(n.getEnumValue(SignInFrequencyInterval::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(SigninFrequencyType::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frequencyInterval property value. The possible values are timeBased, everyTime, unknownFutureValue.
     * @return a {@link SignInFrequencyInterval}
     */
    @jakarta.annotation.Nullable
    public SignInFrequencyInterval getFrequencyInterval() {
        return this.backingStore.get("frequencyInterval");
    }
    /**
     * Gets the type property value. Possible values are: days, hours.
     * @return a {@link SigninFrequencyType}
     */
    @jakarta.annotation.Nullable
    public SigninFrequencyType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the value property value. The number of days or hours.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationType", this.getAuthenticationType());
        writer.writeEnumValue("frequencyInterval", this.getFrequencyInterval());
        writer.writeEnumValue("type", this.getType());
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the authenticationType property value. The possible values are primaryAndSecondaryAuthentication, secondaryAuthentication, unknownFutureValue.
     * @param value Value to set for the authenticationType property.
     */
    public void setAuthenticationType(@jakarta.annotation.Nullable final SignInFrequencyAuthenticationType value) {
        this.backingStore.set("authenticationType", value);
    }
    /**
     * Sets the frequencyInterval property value. The possible values are timeBased, everyTime, unknownFutureValue.
     * @param value Value to set for the frequencyInterval property.
     */
    public void setFrequencyInterval(@jakarta.annotation.Nullable final SignInFrequencyInterval value) {
        this.backingStore.set("frequencyInterval", value);
    }
    /**
     * Sets the type property value. Possible values are: days, hours.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final SigninFrequencyType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the value property value. The number of days or hours.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("value", value);
    }
}
