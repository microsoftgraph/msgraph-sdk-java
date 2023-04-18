package com.microsoft.graph.policies.authenticationstrengthpolicies.item.updateallowedcombinations;

import com.microsoft.graph.models.AuthenticationMethodModes;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateAllowedCombinationsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The allowedCombinations property */
    private java.util.List<AuthenticationMethodModes> allowedCombinations;
    /**
     * Instantiates a new updateAllowedCombinationsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateAllowedCombinationsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAllowedCombinationsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateAllowedCombinationsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAllowedCombinationsPostRequestBody();
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
     * Gets the allowedCombinations property value. The allowedCombinations property
     * @return a authenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAllowedCombinations() {
        return this.allowedCombinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("allowedCombinations", (n) -> { this.setAllowedCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("allowedCombinations", this.getAllowedCombinations());
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
     * Sets the allowedCombinations property value. The allowedCombinations property
     * @param value Value to set for the allowedCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.allowedCombinations = value;
    }
}
