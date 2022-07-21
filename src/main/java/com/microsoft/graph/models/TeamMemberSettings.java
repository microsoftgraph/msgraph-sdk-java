package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamMemberSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If set to true, members can add and remove apps. */
    private Boolean _allowAddRemoveApps;
    /** If set to true, members can add and update private channels. */
    private Boolean _allowCreatePrivateChannels;
    /** If set to true, members can add and update any channels. */
    private Boolean _allowCreateUpdateChannels;
    /** If set to true, members can add, update, and remove connectors. */
    private Boolean _allowCreateUpdateRemoveConnectors;
    /** If set to true, members can add, update, and remove tabs. */
    private Boolean _allowCreateUpdateRemoveTabs;
    /** If set to true, members can delete channels. */
    private Boolean _allowDeleteChannels;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new teamMemberSettings and sets the default values.
     * @return a void
     */
    public TeamMemberSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamMemberSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamMemberSettings
     */
    @javax.annotation.Nonnull
    public static TeamMemberSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMemberSettings();
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
     * Gets the allowAddRemoveApps property value. If set to true, members can add and remove apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAddRemoveApps() {
        return this._allowAddRemoveApps;
    }
    /**
     * Gets the allowCreatePrivateChannels property value. If set to true, members can add and update private channels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCreatePrivateChannels() {
        return this._allowCreatePrivateChannels;
    }
    /**
     * Gets the allowCreateUpdateChannels property value. If set to true, members can add and update any channels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCreateUpdateChannels() {
        return this._allowCreateUpdateChannels;
    }
    /**
     * Gets the allowCreateUpdateRemoveConnectors property value. If set to true, members can add, update, and remove connectors.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCreateUpdateRemoveConnectors() {
        return this._allowCreateUpdateRemoveConnectors;
    }
    /**
     * Gets the allowCreateUpdateRemoveTabs property value. If set to true, members can add, update, and remove tabs.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCreateUpdateRemoveTabs() {
        return this._allowCreateUpdateRemoveTabs;
    }
    /**
     * Gets the allowDeleteChannels property value. If set to true, members can delete channels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteChannels() {
        return this._allowDeleteChannels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamMemberSettings currentObject = this;
        return new HashMap<>(7) {{
            this.put("allowAddRemoveApps", (n) -> { currentObject.setAllowAddRemoveApps(n.getBooleanValue()); });
            this.put("allowCreatePrivateChannels", (n) -> { currentObject.setAllowCreatePrivateChannels(n.getBooleanValue()); });
            this.put("allowCreateUpdateChannels", (n) -> { currentObject.setAllowCreateUpdateChannels(n.getBooleanValue()); });
            this.put("allowCreateUpdateRemoveConnectors", (n) -> { currentObject.setAllowCreateUpdateRemoveConnectors(n.getBooleanValue()); });
            this.put("allowCreateUpdateRemoveTabs", (n) -> { currentObject.setAllowCreateUpdateRemoveTabs(n.getBooleanValue()); });
            this.put("allowDeleteChannels", (n) -> { currentObject.setAllowDeleteChannels(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAddRemoveApps", this.getAllowAddRemoveApps());
        writer.writeBooleanValue("allowCreatePrivateChannels", this.getAllowCreatePrivateChannels());
        writer.writeBooleanValue("allowCreateUpdateChannels", this.getAllowCreateUpdateChannels());
        writer.writeBooleanValue("allowCreateUpdateRemoveConnectors", this.getAllowCreateUpdateRemoveConnectors());
        writer.writeBooleanValue("allowCreateUpdateRemoveTabs", this.getAllowCreateUpdateRemoveTabs());
        writer.writeBooleanValue("allowDeleteChannels", this.getAllowDeleteChannels());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowAddRemoveApps property value. If set to true, members can add and remove apps.
     * @param value Value to set for the allowAddRemoveApps property.
     * @return a void
     */
    public void setAllowAddRemoveApps(@javax.annotation.Nullable final Boolean value) {
        this._allowAddRemoveApps = value;
    }
    /**
     * Sets the allowCreatePrivateChannels property value. If set to true, members can add and update private channels.
     * @param value Value to set for the allowCreatePrivateChannels property.
     * @return a void
     */
    public void setAllowCreatePrivateChannels(@javax.annotation.Nullable final Boolean value) {
        this._allowCreatePrivateChannels = value;
    }
    /**
     * Sets the allowCreateUpdateChannels property value. If set to true, members can add and update any channels.
     * @param value Value to set for the allowCreateUpdateChannels property.
     * @return a void
     */
    public void setAllowCreateUpdateChannels(@javax.annotation.Nullable final Boolean value) {
        this._allowCreateUpdateChannels = value;
    }
    /**
     * Sets the allowCreateUpdateRemoveConnectors property value. If set to true, members can add, update, and remove connectors.
     * @param value Value to set for the allowCreateUpdateRemoveConnectors property.
     * @return a void
     */
    public void setAllowCreateUpdateRemoveConnectors(@javax.annotation.Nullable final Boolean value) {
        this._allowCreateUpdateRemoveConnectors = value;
    }
    /**
     * Sets the allowCreateUpdateRemoveTabs property value. If set to true, members can add, update, and remove tabs.
     * @param value Value to set for the allowCreateUpdateRemoveTabs property.
     * @return a void
     */
    public void setAllowCreateUpdateRemoveTabs(@javax.annotation.Nullable final Boolean value) {
        this._allowCreateUpdateRemoveTabs = value;
    }
    /**
     * Sets the allowDeleteChannels property value. If set to true, members can delete channels.
     * @param value Value to set for the allowDeleteChannels property.
     * @return a void
     */
    public void setAllowDeleteChannels(@javax.annotation.Nullable final Boolean value) {
        this._allowDeleteChannels = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
