import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './styles.css'

function Pagination() {
  return (
    <div className="foodlovers-pagination-container">
    <div className="foodlovers-pagination-box">
        <button className="foodlovers-pagination-button" disabled={true} >
            <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="foodlovers-pagination-button" disabled={false} >
            <Arrow className="foodlovers-flip-horizontal" />
        </button>
    </div>
</div>
  );
}

export default Pagination;