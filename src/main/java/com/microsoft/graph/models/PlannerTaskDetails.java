package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTaskDetails extends Entity implements Parsable {
    /** The collection of checklist items on the task. */
    private PlannerChecklistItems _checklist;
    /** Description of the task. */
    private String _description;
    /** This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task. */
    private PlannerPreviewType _previewType;
    /** The collection of references on the task. */
    private PlannerExternalReferences _references;
    /**
     * Instantiates a new plannerTaskDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTaskDetails() {
        super();
        this.setOdataType("#microsoft.graph.plannerTaskDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskDetails
     */
    @javax.annotation.Nonnull
    public static PlannerTaskDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskDetails();
    }
    /**
     * Gets the checklist property value. The collection of checklist items on the task.
     * @return a plannerChecklistItems
     */
    @javax.annotation.Nullable
    public PlannerChecklistItems getChecklist() {
        return this._checklist;
    }
    /**
     * Gets the description property value. Description of the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerTaskDetails currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checklist", (n) -> { currentObject.setChecklist(n.getObjectValue(PlannerChecklistItems::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("previewType", (n) -> { currentObject.setPreviewType(n.getEnumValue(PlannerPreviewType.class)); });
        deserializerMap.put("references", (n) -> { currentObject.setReferences(n.getObjectValue(PlannerExternalReferences::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @return a plannerPreviewType
     */
    @javax.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this._previewType;
    }
    /**
     * Gets the references property value. The collection of references on the task.
     * @return a plannerExternalReferences
     */
    @javax.annotation.Nullable
    public PlannerExternalReferences getReferences() {
        return this._references;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("checklist", this.getChecklist());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeObjectValue("references", this.getReferences());
    }
    /**
     * Sets the checklist property value. The collection of checklist items on the task.
     * @param value Value to set for the checklist property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChecklist(@javax.annotation.Nullable final PlannerChecklistItems value) {
        this._checklist = value;
    }
    /**
     * Sets the description property value. Description of the task.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @param value Value to set for the previewType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewType(@javax.annotation.Nullable final PlannerPreviewType value) {
        this._previewType = value;
    }
    /**
     * Sets the references property value. The collection of references on the task.
     * @param value Value to set for the references property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferences(@javax.annotation.Nullable final PlannerExternalReferences value) {
        this._references = value;
    }
}
