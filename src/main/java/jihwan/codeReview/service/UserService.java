package jihwan.codeReview.service;

import jihwan.codeReview.dto.request.UserRequestDto;
import jihwan.codeReview.dto.response.UserResponseDto;
import jihwan.codeReview.model.User;
import jihwan.codeReview.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto.UserInfo addUser(UserRequestDto.UserInfo requestDto) {
        User user = userRepository.save(new User(requestDto.getUserName()));
        return new UserResponseDto.UserInfo(user);
    }

    public UserResponseDto.UserInfo getUser(Long userId) {
        User user = getUserById(userId);
        return new UserResponseDto.UserInfo(user);
    }

    public UserResponseDto.UserInfo updateUser(UserRequestDto.UserUpdateRequestDto requestDto) {
        User user = getUserById(requestDto.getId());
        user.updateUser(requestDto.getChangeUserName());
        return new UserResponseDto.UserInfo(userRepository.save(user));
    }

    private User getUserById(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if(user == null) {
            throw new IllegalArgumentException("존재하지 않는 사용자입니다.");
        }
        return user;
    }
}
