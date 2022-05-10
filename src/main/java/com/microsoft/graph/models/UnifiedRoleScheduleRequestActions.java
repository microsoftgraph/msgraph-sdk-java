package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the roleManagement singleton. */
public enum UnifiedRoleScheduleRequestActions implements ValuedEnum {
    AdminAssign("adminAssign"),
    AdminUpdate("adminUpdate"),
    AdminRemove("adminRemove"),
    SelfActivate("selfActivate"),
    SelfDeactivate("selfDeactivate"),
    AdminExtend("adminExtend"),
    AdminRenew("adminRenew"),
    SelfExtend("selfExtend"),
    SelfRenew("selfRenew"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UnifiedRoleScheduleRequestActions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UnifiedRoleScheduleRequestActions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adminAssign": return AdminAssign;
            case "adminUpdate": return AdminUpdate;
            case "adminRemove": return AdminRemove;
            case "selfActivate": return SelfActivate;
            case "selfDeactivate": return SelfDeactivate;
            case "adminExtend": return AdminExtend;
            case "adminRenew": return AdminRenew;
            case "selfExtend": return SelfExtend;
            case "selfRenew": return SelfRenew;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
