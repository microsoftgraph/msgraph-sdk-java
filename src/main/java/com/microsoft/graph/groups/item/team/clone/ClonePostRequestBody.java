package com.microsoft.graph.groups.item.team.clone;

import com.microsoft.graph.models.ClonableTeamParts;
import com.microsoft.graph.models.TeamVisibilityType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the clone method. */
public class ClonePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The classification property */
    private String _classification;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The mailNickname property */
    private String _mailNickname;
    /** The partsToClone property */
    private ClonableTeamParts _partsToClone;
    /** The visibility property */
    private TeamVisibilityType _visibility;
    /**
     * Instantiates a new clonePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClonePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a clonePostRequestBody
     */
    @javax.annotation.Nonnull
    public static ClonePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClonePostRequestBody();
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
     * Gets the classification property value. The classification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassification() {
        return this._classification;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClonePostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("classification", (n) -> { currentObject.setClassification(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("mailNickname", (n) -> { currentObject.setMailNickname(n.getStringValue()); });
            this.put("partsToClone", (n) -> { currentObject.setPartsToClone(n.getEnumValue(ClonableTeamParts.class)); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getEnumValue(TeamVisibilityType.class)); });
        }};
    }
    /**
     * Gets the mailNickname property value. The mailNickname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the partsToClone property value. The partsToClone property
     * @return a clonableTeamParts
     */
    @javax.annotation.Nullable
    public ClonableTeamParts getPartsToClone() {
        return this._partsToClone;
    }
    /**
     * Gets the visibility property value. The visibility property
     * @return a teamVisibilityType
     */
    @javax.annotation.Nullable
    public TeamVisibilityType getVisibility() {
        return this._visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("classification", this.getClassification());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeEnumValue("partsToClone", this.getPartsToClone());
        writer.writeEnumValue("visibility", this.getVisibility());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final String value) {
        this._classification = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the mailNickname property value. The mailNickname property
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the partsToClone property value. The partsToClone property
     * @param value Value to set for the partsToClone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartsToClone(@javax.annotation.Nullable final ClonableTeamParts value) {
        this._partsToClone = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final TeamVisibilityType value) {
        this._visibility = value;
    }
}
