package com.microsoft.graph.models;

import com.microsoft.graph.models.Notebook;
import com.microsoft.graph.models.OnenoteEntityHierarchyModel;
import com.microsoft.graph.models.OnenoteEntitySchemaObjectModel;
import com.microsoft.graph.models.OnenotePage;
import com.microsoft.graph.models.OnenoteResource;
import com.microsoft.graph.models.OnenoteSection;
import com.microsoft.graph.models.SectionGroup;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of application entities. */
public class OnenoteEntityBaseModel extends Entity implements Parsable {
    /** The endpoint where you can get details about the page. Read-only. */
    private String _self;
    /**
     * Instantiates a new onenoteEntityBaseModel and sets the default values.
     * @return a void
     */
    public OnenoteEntityBaseModel() {
        super();
        this.setOdataType("#microsoft.graph.onenoteEntityBaseModel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenoteEntityBaseModel
     */
    @javax.annotation.Nonnull
    public static OnenoteEntityBaseModel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.notebook": return new Notebook();
                case "#microsoft.graph.onenoteEntityHierarchyModel": return new OnenoteEntityHierarchyModel();
                case "#microsoft.graph.onenoteEntitySchemaObjectModel": return new OnenoteEntitySchemaObjectModel();
                case "#microsoft.graph.onenotePage": return new OnenotePage();
                case "#microsoft.graph.onenoteResource": return new OnenoteResource();
                case "#microsoft.graph.onenoteSection": return new OnenoteSection();
                case "#microsoft.graph.sectionGroup": return new SectionGroup();
            }
        }
        return new OnenoteEntityBaseModel();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenoteEntityBaseModel currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("self", (n) -> { currentObject.setSelf(n.getStringValue()); });
        }};
    }
    /**
     * Gets the self property value. The endpoint where you can get details about the page. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSelf() {
        return this._self;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("self", this.getSelf());
    }
    /**
     * Sets the self property value. The endpoint where you can get details about the page. Read-only.
     * @param value Value to set for the self property.
     * @return a void
     */
    public void setSelf(@javax.annotation.Nullable final String value) {
        this._self = value;
    }
}
