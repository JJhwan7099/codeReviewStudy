package jihwan.codeReview.controller;

import jihwan.codeReview.dto.request.UserRequestDto;
import jihwan.codeReview.dto.response.UserResponseDto;
import jihwan.codeReview.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto.UserInfo> addUser(
            @RequestBody UserRequestDto.UserInfo userRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(userRequestDto));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto.UserInfo> getUser(
            @PathVariable Long userId) {
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUser(userId));
    }

    @PostMapping("/update")
    public ResponseEntity<UserResponseDto.UserInfo> updateUser(
            @ModelAttribute UserRequestDto.UserUpdateRequestDto userUpdateRequestDto) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(userUpdateRequestDto));
    }
}
