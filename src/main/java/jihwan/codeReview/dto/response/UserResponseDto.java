package jihwan.codeReview.dto.response;

import jihwan.codeReview.model.User;
import lombok.AllArgsConstructor;

public class UserResponseDto {


    public static class UserInfo {
        private String userName;
        private int countJoinGroup;
        private int countCreateGroup;
        public UserInfo(User user) {
            this.userName = user.getUserName();
            this.countJoinGroup = user.getCountJoinGroup();
            this.countCreateGroup = user.getCountCreateGroup();
        }
    }
}
