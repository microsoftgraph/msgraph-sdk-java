package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateAllowedCombinationsResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Information about why the updateAllowedCombinations action was successful or failed.
     */
    private String additionalInformation;
    /**
     * References to existing Conditional Access policies that use this authentication strength.
     */
    private java.util.List<String> conditionalAccessReferences;
    /**
     * The list of current authentication method combinations allowed by the authentication strength.
     */
    private java.util.List<AuthenticationMethodModes> currentCombinations;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     */
    private java.util.List<AuthenticationMethodModes> previousCombinations;
    /**
     * Instantiates a new updateAllowedCombinationsResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateAllowedCombinationsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAllowedCombinationsResult
     */
    @javax.annotation.Nonnull
    public static UpdateAllowedCombinationsResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAllowedCombinationsResult();
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
     * Gets the additionalInformation property value. Information about why the updateAllowedCombinations action was successful or failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
    /**
     * Gets the conditionalAccessReferences property value. References to existing Conditional Access policies that use this authentication strength.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getConditionalAccessReferences() {
        return this.conditionalAccessReferences;
    }
    /**
     * Gets the currentCombinations property value. The list of current authentication method combinations allowed by the authentication strength.
     * @return a AuthenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getCurrentCombinations() {
        return this.currentCombinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("conditionalAccessReferences", (n) -> { this.setConditionalAccessReferences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("currentCombinations", (n) -> { this.setCurrentCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previousCombinations", (n) -> { this.setPreviousCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        return deserializerMap;
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
     * Gets the previousCombinations property value. The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     * @return a AuthenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getPreviousCombinations() {
        return this.previousCombinations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeCollectionOfPrimitiveValues("conditionalAccessReferences", this.getConditionalAccessReferences());
        writer.writeCollectionOfEnumValues("currentCombinations", this.getCurrentCombinations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("previousCombinations", this.getPreviousCombinations());
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
     * Sets the additionalInformation property value. Information about why the updateAllowedCombinations action was successful or failed.
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the conditionalAccessReferences property value. References to existing Conditional Access policies that use this authentication strength.
     * @param value Value to set for the conditionalAccessReferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessReferences(@javax.annotation.Nullable final java.util.List<String> value) {
        this.conditionalAccessReferences = value;
    }
    /**
     * Sets the currentCombinations property value. The list of current authentication method combinations allowed by the authentication strength.
     * @param value Value to set for the currentCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.currentCombinations = value;
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
    /**
     * Sets the previousCombinations property value. The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     * @param value Value to set for the previousCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.previousCombinations = value;
    }
}
