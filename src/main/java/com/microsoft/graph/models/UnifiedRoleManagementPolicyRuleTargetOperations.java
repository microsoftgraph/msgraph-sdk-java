package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the policyRoot singleton.  */
public enum UnifiedRoleManagementPolicyRuleTargetOperations implements ValuedEnum {
    All("all"),
    Activate("activate"),
    Deactivate("deactivate"),
    Assign("assign"),
    Update("update"),
    Remove("remove"),
    Extend("extend"),
    Renew("renew"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UnifiedRoleManagementPolicyRuleTargetOperations(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UnifiedRoleManagementPolicyRuleTargetOperations forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "activate": return Activate;
            case "deactivate": return Deactivate;
            case "assign": return Assign;
            case "update": return Update;
            case "remove": return Remove;
            case "extend": return Extend;
            case "renew": return Renew;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
