package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WhatIfAnalysisResult extends ConditionalAccessPolicy implements Parsable {
    /**
     * Instantiates a new {@link WhatIfAnalysisResult} and sets the default values.
     */
    public WhatIfAnalysisResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WhatIfAnalysisResult}
     */
    @jakarta.annotation.Nonnull
    public static WhatIfAnalysisResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WhatIfAnalysisResult();
    }
    /**
     * Gets the analysisReasons property value. The analysisReasons property
     * @return a {@link EnumSet<WhatIfAnalysisReasons>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WhatIfAnalysisReasons> getAnalysisReasons() {
        return this.backingStore.get("analysisReasons");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analysisReasons", (n) -> { this.setAnalysisReasons(n.getEnumSetValue(WhatIfAnalysisReasons::forValue)); });
        deserializerMap.put("policyApplies", (n) -> { this.setPolicyApplies(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyApplies property value. Specifies whether the policy applies to the sign-in properties provided in the request body. If policyApplies is true, the policy applies to the sign-in based on the sign-in properties provided. If policyApplies is false, the policy doesn&apos;t apply to the sign-in based on the sign-in properties provided and the analysisReasons property is populated to show the reason for the policy not applying.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPolicyApplies() {
        return this.backingStore.get("policyApplies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("analysisReasons", this.getAnalysisReasons());
        writer.writeBooleanValue("policyApplies", this.getPolicyApplies());
    }
    /**
     * Sets the analysisReasons property value. The analysisReasons property
     * @param value Value to set for the analysisReasons property.
     */
    public void setAnalysisReasons(@jakarta.annotation.Nullable final EnumSet<WhatIfAnalysisReasons> value) {
        this.backingStore.set("analysisReasons", value);
    }
    /**
     * Sets the policyApplies property value. Specifies whether the policy applies to the sign-in properties provided in the request body. If policyApplies is true, the policy applies to the sign-in based on the sign-in properties provided. If policyApplies is false, the policy doesn&apos;t apply to the sign-in based on the sign-in properties provided and the analysisReasons property is populated to show the reason for the policy not applying.
     * @param value Value to set for the policyApplies property.
     */
    public void setPolicyApplies(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("policyApplies", value);
    }
}
