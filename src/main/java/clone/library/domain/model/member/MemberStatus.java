package clone.library.domain.model.member;


import org.seasar.doma.Domain;

/**
 * 会員登録の状態
 */
@Domain(valueType = String.class, factoryMethod = "of", accessorMethod = "value")
public enum MemberStatus {
    NOT_REGISTER("0", "未登録"),
    VALID("1", "有効"),
    INVALID("2", "無効");

    private final String value;
    private final String name;

    MemberStatus(final String value, final String name) {
        this.value = value;
        this.name = name;
    }

    public String value() {
        return this.value;
    }

    public static MemberStatus of(final String value) {
        for (MemberStatus memberStatus : MemberStatus.values()) { //拡張for文による走査
            if (memberStatus.value.equals(value)) {
                return memberStatus;                 //条件に一致するインスタンスを返す
            }
        }
        return null;
    }

}
