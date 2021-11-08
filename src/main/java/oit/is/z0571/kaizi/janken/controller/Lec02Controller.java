package oit.is.z0571.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0571.janken.model.Chamber;

/**
 * Lec02Controller
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
public class Lec02Controller {

  @GetMapping("/step1")
  public String lec02() {
    return "lec02.html";
  }

  /**
   * @param model
   * @return
   */
  @GetMapping("/step2")
  public String guJanken(ModelMap model) {
    int user=1;
    String userhand="Gu";
    int cpu=1;
    String cpuhand="Gu";

    int result1=user-cpu;
    String result2="Draw";

    model.addAttribute("userhand", userhand);
    model.addAttribute("cpuhand", cpuhand);
    model.addAttribute("result2", result2);
    return "lec02.html";
  }

  /**
   * @param model
   * @return
   */
  @GetMapping("/step3")
  public String chokiJanken(ModelMap model) {
    int user=2;
    String userhand="Choki";
    int cpu=1;
    String cpuhand="Gu";

    int result1=user-cpu;
    String result2="You lose";

    model.addAttribute("userhand", userhand);
    model.addAttribute("cpuhand", cpuhand);
    model.addAttribute("result2", result2);
    return "lec02.html";
  }

  /**
   * @param model
   * @return
   */
  @GetMapping("/step4")
  public String paJanken(ModelMap model) {
    int user=3;
    String userhand="Pa";
    int cpu=1;
    String cpuhand="Gu";

    int result1=user-cpu;
    String result2="You win";

    model.addAttribute("userhand", userhand);
    model.addAttribute("cpuhand", cpuhand);
    model.addAttribute("result2", result2);
    return "lec02.html";
  }

}
