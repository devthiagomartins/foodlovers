import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'

function Navbar(){

    return(

      <header>
      <nav className="container">
        <div className="foodlovers-nav-content">
          <h1>FoodLovers</h1>
          <a href="http://github.com/devthiagomartins">
            <div className="foodlovers-contact-container">
              <GithubIcon />
              <p className="foodlovers-contact-link">/devthiagomartins</p>
            </div>
          </a>
        </div>
      </nav>
    </header>

    );
}

export default Navbar;