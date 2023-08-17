package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SignInFrequencySessionControl extends ConditionalAccessSessionControl implements Parsable {
    /**
     * The possible values are primaryAndSecondaryAuthentication, secondaryAuthentication, unknownFutureValue.
     */
    private SignInFrequencyAuthenticationType authenticationType;
    /**
     * The possible values are timeBased, everyTime, unknownFutureValue.
     */
    private SignInFrequencyInterval frequencyInterval;
    /**
     * Possible values are: days, hours.
     */
    private SigninFrequencyType type;
    /**
     * The number of days or hours.
     */
    private Integer value;
    /**
     * Instantiates a new signInFrequencySessionControl and sets the default values.
     */
    public SignInFrequencySessionControl() {
        super();
        this.setOdataType("#microsoft.graph.signInFrequencySessionControl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signInFrequencySessionControl
     */
    @jakarta.annotation.Nonnull
    public static SignInFrequencySessionControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInFrequencySessionControl();
    }
    /**
     * Gets the authenticationType property value. The possible values are primaryAndSecondaryAuthentication, secondaryAuthentication, unknownFutureValue.
     * @return a signInFrequencyAuthenticationType
     */
    @jakarta.annotation.Nullable
    public SignInFrequencyAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getEnumValue(SignInFrequencyAuthenticationType.class)); });
        deserializerMap.put("frequencyInterval", (n) -> { this.setFrequencyInterval(n.getEnumValue(SignInFrequencyInterval.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(SigninFrequencyType.class)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frequencyInterval property value. The possible values are timeBased, everyTime, unknownFutureValue.
     * @return a signInFrequencyInterval
     */
    @jakarta.annotation.Nullable
    public SignInFrequencyInterval getFrequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * Gets the type property value. Possible values are: days, hours.
     * @return a signinFrequencyType
     */
    @jakarta.annotation.Nullable
    public SigninFrequencyType getType() {
        return this.type;
    }
    /**
     * Gets the value property value. The number of days or hours.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.value;
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
        this.authenticationType = value;
    }
    /**
     * Sets the frequencyInterval property value. The possible values are timeBased, everyTime, unknownFutureValue.
     * @param value Value to set for the frequencyInterval property.
     */
    public void setFrequencyInterval(@jakarta.annotation.Nullable final SignInFrequencyInterval value) {
        this.frequencyInterval = value;
    }
    /**
     * Sets the type property value. Possible values are: days, hours.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final SigninFrequencyType value) {
        this.type = value;
    }
    /**
     * Sets the value property value. The number of days or hours.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
