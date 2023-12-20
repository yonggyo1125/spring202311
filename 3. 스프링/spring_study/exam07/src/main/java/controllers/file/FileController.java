package controllers.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload")
    public String upload() {

        return "file/upload";
    }

    @PostMapping("/upload")
    public String uploadPs() {

        return "file/upload";
    }
}
