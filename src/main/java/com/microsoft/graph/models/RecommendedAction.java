package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecommendedAction implements AdditionalDataHolder, Parsable {
    /** Web URL to the recommended action. */
    private String _actionWebUrl;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Potential improvement in the tenant security score from the recommended action. */
    private Double _potentialScoreImpact;
    /** Title of the recommended action. */
    private String _title;
    /**
     * Instantiates a new recommendedAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecommendedAction() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.recommendedAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recommendedAction
     */
    @javax.annotation.Nonnull
    public static RecommendedAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendedAction();
    }
    /**
     * Gets the actionWebUrl property value. Web URL to the recommended action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionWebUrl() {
        return this._actionWebUrl;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecommendedAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("actionWebUrl", (n) -> { currentObject.setActionWebUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("potentialScoreImpact", (n) -> { currentObject.setPotentialScoreImpact(n.getDoubleValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the potentialScoreImpact property value. Potential improvement in the tenant security score from the recommended action.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getPotentialScoreImpact() {
        return this._potentialScoreImpact;
    }
    /**
     * Gets the title property value. Title of the recommended action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionWebUrl", this.getActionWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("potentialScoreImpact", this.getPotentialScoreImpact());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionWebUrl property value. Web URL to the recommended action.
     * @param value Value to set for the actionWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionWebUrl(@javax.annotation.Nullable final String value) {
        this._actionWebUrl = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the potentialScoreImpact property value. Potential improvement in the tenant security score from the recommended action.
     * @param value Value to set for the potentialScoreImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPotentialScoreImpact(@javax.annotation.Nullable final Double value) {
        this._potentialScoreImpact = value;
    }
    /**
     * Sets the title property value. Title of the recommended action.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
