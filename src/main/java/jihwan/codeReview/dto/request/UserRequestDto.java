package jihwan.codeReview.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class UserRequestDto {

    @Getter
    public static class UserInfo {
        @NotBlank
        @NotNull
        private String userName;
    }

    @Getter
    public static class UserUpdateRequestDto {
        @NotNull
        private Long id;
        @NotBlank
        @NotNull
        private String changeUserName;
    }


}
