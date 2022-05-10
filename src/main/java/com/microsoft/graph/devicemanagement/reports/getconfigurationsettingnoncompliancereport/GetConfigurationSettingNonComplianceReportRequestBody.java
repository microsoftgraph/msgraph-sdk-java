package microsoft.graph.devicemanagement.reports.getconfigurationsettingnoncompliancereport;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getConfigurationSettingNonComplianceReport method. */
public class GetConfigurationSettingNonComplianceReportRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The filter property */
    private String _filter;
    /** The groupBy property */
    private java.util.List<String> _groupBy;
    /** The name property */
    private String _name;
    /** The orderBy property */
    private java.util.List<String> _orderBy;
    /** The search property */
    private String _search;
    /** The select property */
    private java.util.List<String> _select;
    /** The sessionId property */
    private String _sessionId;
    /** The skip property */
    private Integer _skip;
    /** The top property */
    private Integer _top;
    /**
     * Instantiates a new getConfigurationSettingNonComplianceReportRequestBody and sets the default values.
     * @return a void
     */
    public GetConfigurationSettingNonComplianceReportRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getConfigurationSettingNonComplianceReportRequestBody
     */
    @javax.annotation.Nonnull
    public static GetConfigurationSettingNonComplianceReportRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetConfigurationSettingNonComplianceReportRequestBody();
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
        final GetConfigurationSettingNonComplianceReportRequestBody currentObject = this;
        return new HashMap<>(9) {{
            this.put("filter", (n) -> { currentObject.setFilter(n.getStringValue()); });
            this.put("groupBy", (n) -> { currentObject.setGroupBy(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("orderBy", (n) -> { currentObject.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("search", (n) -> { currentObject.setSearch(n.getStringValue()); });
            this.put("select", (n) -> { currentObject.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sessionId", (n) -> { currentObject.setSessionId(n.getStringValue()); });
            this.put("skip", (n) -> { currentObject.setSkip(n.getIntegerValue()); });
            this.put("top", (n) -> { currentObject.setTop(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the filter property value. The filter property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this._filter;
    }
    /**
     * Gets the groupBy property value. The groupBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupBy() {
        return this._groupBy;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the orderBy property value. The orderBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this._orderBy;
    }
    /**
     * Gets the search property value. The search property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSearch() {
        return this._search;
    }
    /**
     * Gets the select property value. The select property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this._select;
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionId() {
        return this._sessionId;
    }
    /**
     * Gets the skip property value. The skip property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkip() {
        return this._skip;
    }
    /**
     * Gets the top property value. The top property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTop() {
        return this._top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("filter", this.getFilter());
        writer.writeCollectionOfPrimitiveValues("groupBy", this.getGroupBy());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeStringValue("search", this.getSearch());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
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
     * Sets the filter property value. The filter property
     * @param value Value to set for the filter property.
     * @return a void
     */
    public void setFilter(@javax.annotation.Nullable final String value) {
        this._filter = value;
    }
    /**
     * Sets the groupBy property value. The groupBy property
     * @param value Value to set for the groupBy property.
     * @return a void
     */
    public void setGroupBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this._groupBy = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the orderBy property value. The orderBy property
     * @param value Value to set for the orderBy property.
     * @return a void
     */
    public void setOrderBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this._orderBy = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     * @return a void
     */
    public void setSearch(@javax.annotation.Nullable final String value) {
        this._search = value;
    }
    /**
     * Sets the select property value. The select property
     * @param value Value to set for the select property.
     * @return a void
     */
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this._select = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     * @return a void
     */
    public void setSessionId(@javax.annotation.Nullable final String value) {
        this._sessionId = value;
    }
    /**
     * Sets the skip property value. The skip property
     * @param value Value to set for the skip property.
     * @return a void
     */
    public void setSkip(@javax.annotation.Nullable final Integer value) {
        this._skip = value;
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     * @return a void
     */
    public void setTop(@javax.annotation.Nullable final Integer value) {
        this._top = value;
    }
}
